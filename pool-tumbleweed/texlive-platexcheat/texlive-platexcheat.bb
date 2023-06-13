SUMMARY = "A LaTeX cheat sheet, in Japanese"
DESCRIPTION = "This is a translation to Japanese of Winston Chang's LaTeX \
cheat sheet (a reference sheet for writing scientific papers). \
It has been adapted to Japanese standards using pLaTeX, and \
also attached additional information of 'standard LaTeX' \
(especially about math-mode)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn49557"

RPM_NAME = "texlive-platexcheat-2023.201.3.1svn49557-52.1.noarch.rpm"
RPM_HASH = "74f2d5f4d347094a7799dd77653596679369b33215e731f74c4c65c9c8a8248b25dbb39892343f2f389f5b37f7eed7904ca49f52995ba8dd8693ecfd38c8e78a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-platexcheat"

RDEPENDS:${PN} += "/bin/sh \
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
