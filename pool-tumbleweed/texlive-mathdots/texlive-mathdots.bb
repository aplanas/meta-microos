SUMMARY = "Commands to produce dots in math that respect font size"
DESCRIPTION = "Redefines \\ddots and \\vdots, and defines \\iddots. The dots \
produced by \\iddots slant in the opposite direction to \\ddots. \
All the commands are designed to change size appropriately in \
scripts, as well as in response to LaTeX size changing \
commands. The commands may also be used in plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.9svn34301"

RPM_NAME = "texlive-mathdots-2023.208.0.0.9svn34301-53.1.noarch.rpm"
RPM_HASH = "08427eda659bdace33252913037c80d823de6cad81f80fea280a54fc079b29c5543bfa12e279e2cce48fac78a0572f4cce36c096d57f8b171e729e03e152ce81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathdots.sty \
tex-mathdots.tex \
texlive-mathdots"

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
