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

PV = "2023.201.1.2svn42635"

RPM_NAME = "texlive-historische-zeitschrift-2023.201.1.2svn42635-53.2.noarch.rpm"
RPM_HASH = "bd96f6a5adfcef05f2467a649adbc6f3bdb43f10eea1650c21e0ff9a6290d0812c13d59f809b393e5a7d35ae9ac5af59d8041a08999f76899f0410ae3dc4606c"
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
