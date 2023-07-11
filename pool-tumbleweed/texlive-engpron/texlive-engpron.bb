SUMMARY = "Helps to type the pronunciation of English words"
DESCRIPTION = "This package provides macros beginning with the PS character, \
made active, which enable us to write the British or American \
English pronunciation as one can find it in the 'English \
Pronouncing Dictionary' by Daniel Jones. There is an option to \
typeset the pronunciation in the style of Harrap's dictionary."
LICENSE = "LPPL-1.0"

PV = "2023.201.2svn16558"

RPM_NAME = "texlive-engpron-2023.201.2svn16558-53.2.noarch.rpm"
RPM_HASH = "f48aff5e86ad712feb0474dca079cf29eac795d84fad10eb3d21219337722c9d25105a498f279d971a4a47b200d9021be9a07a433fed591a3be77aae0d904e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engpron-tools.sty \
tex-engpron.sty \
texlive-engpron"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-drac.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-tipa.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
