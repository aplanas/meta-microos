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

RPM_NAME = "texlive-historische-zeitschrift-2023.209.1.2svn42635-54.2.noarch.rpm"
RPM_HASH = "db8d5a91314344da7dff65121ff9fb992cf3640f37f6866901cc2e269fe9fc7340a51f9177b374ea65488e78083de291ab5289c9f63b3852966320ae9a56973e"
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
