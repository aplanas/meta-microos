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

RPM_NAME = "perl-File-Comments-0.08-10.12.aarch64.rpm"
RPM_HASH = "8779d0624a6e6c8778b49ac6b6f71822812c5a104d30ec5eece9fd7caabc73ddff8916ec73a19ba87e4d59c0e8fbc5ac01f21f3adeb20a59c1acb998e661b74b"

RPROVIDES:${PN} += "perl(File::Comments) \
perl(File::Comments::Plugin) \
perl(File::Comments::Plugin::C) \
perl(File::Comments::Plugin::HTML) \
perl(File::Comments::Plugin::Java) \
perl(File::Comments::Plugin::JavaScript) \
perl(File::Comments::Plugin::Makefile) \
perl(File::Comments::Plugin::PHP) \
perl(File::Comments::Plugin::Perl) \
perl(File::Comments::Plugin::Python) \
perl(File::Comments::Plugin::Shell) \
perl(File::Comments::Target) \
perl(PodExtractor) \
perl-File-Comments \
perl-File-Comments(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Archive::Tar) \
perl(HTML::TokeParser) \
perl(HTML::TreeBuilder) \
perl(Log::Log4perl) \
perl(Module::Pluggable) \
perl(PPI) \
perl(Pod::Parser) \
perl(Sysadm::Install)"

inherit rpm
