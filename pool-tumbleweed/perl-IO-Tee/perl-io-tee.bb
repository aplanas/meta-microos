SUMMARY = "Multiplex output to multiple output handles"
DESCRIPTION = "'IO::Tee' objects can be used to multiplex input and output in two \
different ways. The first way is to multiplex output to zero or more output \
handles. The 'IO::Tee' constructor, given a list of output handles, returns \
a tied handle that can be written to. When written to (using print or \
printf), the 'IO::Tee' object multiplexes the output to the list of handles \
originally passed to the constructor. As a shortcut, you can also directly \
pass a string or an array reference to the constructor, in which case \
'IO::File::new' is called for you with the specified argument or arguments. \
 \
The second way is to multiplex input from one input handle to zero or more \
output handles as it is being read. The 'IO::Tee' constructor, given an \
input handle followed by a list of output handles, returns a tied handle \
that can be read from as well as written to. When written to, the 'IO::Tee' \
object multiplexes the output to all handles passed to the constructor, as \
described in the previous paragraph. When read from, the 'IO::Tee' object \
reads from the input handle given as the first argument to the 'IO::Tee' \
constructor, then writes any data read to the output handles given as the \
remaining arguments to the constructor. \
 \
The 'IO::Tee' class supports certain 'IO::Handle' and 'IO::File' methods \
related to input and output. In particular, the following methods will \
iterate themselves over all handles associated with the 'IO::Tee' object, \
and return TRUE indicating success if and only if all associated handles \
returned TRUE indicating success: \
 \
* close \
 \
* truncate \
 \
* write \
 \
* syswrite \
 \
* format_write \
 \
* formline \
 \
* fcntl \
 \
* ioctl \
 \
* flush \
 \
* clearerr \
 \
* seek \
 \
The following methods perform input multiplexing as described above: \
 \
* read \
 \
* sysread \
 \
* readline \
 \
* getc \
 \
* gets \
 \
* eof \
 \
* getline \
 \
* getlines \
 \
The following methods can be used to set (but not retrieve) the current \
values of output-related state variables on all associated handles: \
 \
* autoflush \
 \
* output_field_separator \
 \
* output_record_separator \
 \
* format_page_number \
 \
* format_lines_per_page \
 \
* format_lines_left \
 \
* format_name \
 \
* format_top_name \
 \
* format_line_break_characters \
 \
* format_formfeed \
 \
The following methods are directly passed on to the input handle given as \
the first argument to the 'IO::Tee' constructor: \
 \
* input_record_separator \
 \
* input_line_number \
 \
Note that the return value of input multiplexing methods (such as 'print') \
is always the return value of the input action, not the return value of \
subsequent output actions. In particular, no error is indicated by the \
return value if the input action itself succeeds but subsequent output \
multiplexing fails."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.66"

RPM_NAME = "perl-IO-Tee-0.66-1.15.noarch.rpm"
RPM_HASH = "e1ef92d058768f00ae872bedc0aba8e5a8be0de998b80fd1d45360a3cbe2a8975b029b0a7f6c7fc0d55591d249ff2194e0074d986a0bbfd9a89baa0ba1906d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Tee \
perl-IO-Tee"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
