SUMMARY = "Utilities for interactive I/O"
DESCRIPTION = "This module provides three utility subroutines that make it easier to \
develop interactive applications. \
 \
The 'ARGV' filehandle, the one that '<>' or an empty 'readline()' uses, has \
various magic associated with it. It's not actually opened until you try to \
read from it. Checking '-t ARGV' before you've tried to read from it might \
give you the wrong answer. Not only that, you might not read from 'ARGV'. \
If the value in '@ARGV' is the magic filename '-' (a convention to mean the \
standard filehandle for input or output), 'ARGV' might actually be 'STDIN'. \
You don't want to think about all of this. This module is discussed in \
_Perl Best Practices_ on page 218. Also see the 'ARGV' entry in perlvar and \
the 'readline' entry in perlfunc. \
 \
* 'is_interactive()' \
 \
This subroutine returns true if '*ARGV' and the currently selected \
filehandle (usually '*STDOUT') are connected to the terminal. The test is \
considerably more sophisticated than: \
 \
    -t *ARGV && -t *STDOUT \
 \
as it takes into account the magic behaviour of '*ARGV'. \
 \
You can also pass 'is_interactive' a writable filehandle, in which case it \
requires that filehandle be connected to a terminal (instead of the \
currently selected). The usual suspect here is '*STDERR': \
 \
    if ( is_interactive(*STDERR) ) { \
        carp $warning; \
    } \
 \
* 'interactive()' \
 \
This subroutine returns '*STDOUT' if 'is_interactive' is true. If \
'is_interactive()' is false, 'interactive' returns a filehandle that does \
not print. \
 \
This makes it easy to create applications that print out only when the \
application is interactive: \
 \
    print {interactive} 'Please enter a value: '; \
    my $value = <>; \
 \
You can also pass 'interactive' a writable filehandle, in which case it \
writes to that filehandle if it is connected to a terminal (instead of \
writing to '*STDOUT'). Once again, the usual suspect is '*STDERR': \
 \
    print {interactive(*STDERR)} $warning; \
 \
* 'busy {...}' \
 \
This subroutine takes a block as its single argument and executes that \
block. Whilst the block is executed, '*ARGV' is temporarily replaced by a \
closed filehandle. That is, no input from '*ARGV' is possible in a 'busy' \
block. Furthermore, any attempts to send input into the 'busy' block \
through '*ARGV' is intercepted and a warning message is printed to \
'*STDERR'. The 'busy' call returns a filehandle that contains the \
intercepted input. \
 \
A 'busy' block is therefore useful to prevent attempts at input when the \
program is busy at some non-interactive task."
LICENSE = "Artistic-2.0"

PV = "1.023"

RPM_NAME = "perl-IO-Interactive-1.023-1.11.noarch.rpm"
RPM_HASH = "e945e17d66ed09d3a1d438fe0eb4d5a425a604999aa805f10c267100094de7b5aba05db82da369564b5903534bccb135be0251eed1704ab9dcf1b02bbe8791c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Interactive \
perl-IO-Interactive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
