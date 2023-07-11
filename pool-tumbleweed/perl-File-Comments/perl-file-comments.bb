SUMMARY = "Recognizes file formats and extracts format-specific comments"
DESCRIPTION = "File::Comments guesses the type of a given file, determines the format used \
for comments, extracts all comments, and returns them as a reference to an \
array of chunks. Alternatively, it strips all comments from a file. \
 \
Currently supported are Perl scripts, C/C++ programs, Java, makefiles, \
JavaScript, Python and PHP. \
 \
The plugin architecture used by File::Comments makes it easy to add new \
formats. To support a new format, a new plugin module has to be installed. \
No modifications to the File::Comments codebase are necessary, new plugins \
will be picked up automatically. \
 \
File::Comments can also be used to simply guess a file's type. It it \
somewhat more flexible than File::MMagic and File::Type. File types in \
File::Comments are typically based on file name suffixes (*.c, *.pl, etc.). \
If no suffix is available, or a given suffix is ambiguous (e.g. if several \
plugins have registered a handler for the same suffix), then the file's \
content is used to narrow down the possibilities and arrive at a decision. \
 \
WARNING: THIS MODULE IS UNDER DEVELOPMENT, QUALITY IS ALPHA. IF YOU FIND \
BUGS, OR WANT TO CONTRIBUTE PLUGINS, PLEASE SEND THEM MY WAY."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.08"

RPM_NAME = "perl-File-Comments-0.08-10.13.aarch64.rpm"
RPM_HASH = "03051505aa62dcb2bf53b939c5caab59bc4796eb5ac1706439c420d52867594fc89341125258f3c7087e724990e613fb98d0a8aba0050045062cb3e7179dc33c"

RPROVIDES:${PN} += "perl-File--Comments \
perl-File--Comments--Plugin \
perl-File--Comments--Plugin--C \
perl-File--Comments--Plugin--HTML \
perl-File--Comments--Plugin--Java \
perl-File--Comments--Plugin--JavaScript \
perl-File--Comments--Plugin--Makefile \
perl-File--Comments--Plugin--PHP \
perl-File--Comments--Plugin--Perl \
perl-File--Comments--Plugin--Python \
perl-File--Comments--Plugin--Shell \
perl-File--Comments--Target \
perl-File-Comments \
perl-PodExtractor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Archive--Tar \
perl-HTML--TokeParser \
perl-HTML--TreeBuilder \
perl-Log--Log4perl \
perl-Module--Pluggable \
perl-PPI \
perl-Pod--Parser \
perl-Sysadm--Install"

inherit rpm
