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

RPM_NAME = "perl-File-Comments-0.08-10.14.aarch64.rpm"
RPM_HASH = "17d552b8be6d83263db7eb3830aa3d79ad151f47de857c6bb18044786d5669af6628a9a958ea8ef9cb3993c1dd70954b1070b30ca23c792400c0bd541546df8e"

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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Archive--Tar \
perl-HTML--TokeParser \
perl-HTML--TreeBuilder \
perl-Log--Log4perl \
perl-Module--Pluggable \
perl-PPI \
perl-Pod--Parser \
perl-Sysadm--Install"

inherit rpm
