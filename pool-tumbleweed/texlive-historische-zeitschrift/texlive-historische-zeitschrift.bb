SUMMARY = "BibLaTeX style for the journal 'Historische Zeitschrift'"
DESCRIPTION = "The package provides citations according with the house style \
of the 'Historische Zeitschrift', a German historical journal. \
The scheme is a fullcite for the first citation and 'Author, \
Shorttitle (as note N, P)' for later citations (P being the \
page number). For further details, see the description of the \
house style at the journal's site. The package depends on \
BibLaTeX (version 3.3 or higher) as well as etoolbox (version \
1.5 or higher)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn42635"

RPM_NAME = "texlive-historische-zeitschrift-2023.209.1.2svn42635-54.1.noarch.rpm"
RPM_HASH = "9199b7dcc966d998afd6186ed5ea1970266c9d024fac13a338f5bffa00f4ac173581abc01bf820cee5a9f5dedeb26c3dc0c290db38090618df909d7926e926c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-historische-zeitschrift.bbx \
tex-historische-zeitschrift.cbx \
tex-historische-zeitschrift.lbx \
texlive-historische-zeitschrift"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
