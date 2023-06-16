SUMMARY = "Tools for creating documentation from texinfo sources"
DESCRIPTION = "Texinfo is a documentation system that uses a single source file to \
produce both online information and printed output.  Using Texinfo, you \
can create a printed document with the normal features of a book, \
including chapters, sections, cross-references, and indices.  From the \
same Texinfo source file, you can create a menu-driven, online info \
file with nodes, menus, cross-references, and indices using the included \
makeinfo tool."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "texinfo-7.0.3-1.1.aarch64.rpm"
RPM_HASH = "7350dee3de4acd8c299ef0954b8f6a39b5d4368e797706c90de57ab707ae57891f990684ff15197bc474eb7a6fe2cf93f6f9d5fb165688f9c90a76dc10c272d5"

RPROVIDES:${PN} += "texinfo"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
makeinfo \
perl \
perl-Text-Unidecode \
perl-gettext \
texlive-bibtex \
texlive-latex \
texlive-makeindex \
texlive-pdftex \
texlive-tex \
texlive-texinfo"

inherit rpm
