SUMMARY = "Draw quantum circuit diagrams"
DESCRIPTION = "The purpose of this package is to extend TikZ with the \
functionality for drawing quantum circuit diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.6svn54911"

RPM_NAME = "texlive-quantikz-2023.209.0.0.9.6svn54911-54.2.noarch.rpm"
RPM_HASH = "ae41a25435f8eb988847256e33efdd852c1c9b21dbc6337993138c9e2457a6be40ad2432b3053353ffd400f63b0bb1edc4aed06e0f17af96e3f1bcd5aea7364a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quantikz.sty \
tex-tikzlibraryquantikz.code.tex \
texlive-quantikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
