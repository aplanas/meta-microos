SUMMARY = "Access to R analysis from within a document"
DESCRIPTION = "The package mediates interaction between LaTeX and R; it allows \
LaTeX to set R's parameters, and provides code to read R \
output."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn30084"

RPM_NAME = "texlive-rterface-2023.201.svn30084-53.1.noarch.rpm"
RPM_HASH = "31c64f7e798105f281431ec7ff805c2a729495d9e493aff8b4317b08fffc61d4c860735ef33b27e0062d081c30be1ecaab6dacf810f687056eaee20ad6063002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rterface.sty \
texlive-rterface"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-newfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
