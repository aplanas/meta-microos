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

RPM_NAME = "texinfo-7.0.3-1.4.aarch64.rpm"
RPM_HASH = "dd116ba637bdd663d07e73642f2697f713a183208e07b93d0581c3f16e917fd61e7b8c4d3091b29f8ff166c3fa4e00ee8146c2a3e8d0b0c7338df88d6e5ed7d5"

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
