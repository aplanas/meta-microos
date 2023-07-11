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

RPM_NAME = "texinfo-7.0.3-1.3.aarch64.rpm"
RPM_HASH = "13c749cc553aa8bdff27500b79d097d692dbc0a51583496faf22a543f67dda411b0c1f260a7a0bd2e367447a5fb51747a2536683f2f9382a30c67668961f48e5"

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
