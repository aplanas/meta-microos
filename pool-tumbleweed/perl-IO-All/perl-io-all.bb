SUMMARY = "IO::All to Larry Wall!"
DESCRIPTION = "IO::All combines all of the best Perl IO modules into a single nifty object \
oriented interface to greatly simplify your everyday Perl IO idioms. It \
exports a single function called 'io', which returns a new IO::All object. \
And that object can do it all! \
 \
The IO::All object is a proxy for IO::File, IO::Dir, IO::Socket, Tie::File, \
File::Spec, File::Path, File::MimeInfo and File::ReadBackwards; as well as \
all the DBM and MLDBM modules. You can use most of the methods found in \
these classes and in IO::Handle (which they inherit from). IO::All adds \
dozens of other helpful idiomatic methods including file stat and \
manipulation functions. \
 \
IO::All is pluggable, and modules like IO::All::LWP and IO::All::Mailto add \
even more functionality. Optionally, every IO::All object can be tied to \
itself. This means that you can use most perl IO builtins on it: readline, \
'<>', getc, print, printf, syswrite, sysread, close. \
 \
The distinguishing magic of IO::All is that it will automatically open (and \
close) files, directories, sockets and other IO things for you. You never \
need to specify the mode ('<', '>>', etc), since it is determined by the \
usage context. That means you can replace this: \
 \
    open STUFF, '<', './mystuff' \
      or die 'Can't open './mystuff' for input:\\n$!'; \
    local $/; \
    my $stuff = <STUFF>; \
    close STUFF; \
 \
with this: \
 \
    my $stuff < io './mystuff'; \
 \
And that is a *good thing*!"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.87"

RPM_NAME = "perl-IO-All-0.87-1.21.noarch.rpm"
RPM_HASH = "33ab9dbb4c0016ac1e676d111587ed5030d5ac64946997cebb3e1a328cdea62bf6b0e9dd199b59c921ebee83eaf9c486e89cdf2aa766ead055554262b620e3d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IO::All) \
perl(IO::All::Base) \
perl(IO::All::DBM) \
perl(IO::All::Dir) \
perl(IO::All::File) \
perl(IO::All::Filesys) \
perl(IO::All::Link) \
perl(IO::All::MLDBM) \
perl(IO::All::Pipe) \
perl(IO::All::STDIO) \
perl(IO::All::Socket) \
perl(IO::All::String) \
perl(IO::All::Temp) \
perl-IO-All"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
