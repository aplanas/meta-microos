SUMMARY = "A simple key/value system for TeX and LaTeX"
DESCRIPTION = "The package provides a simple key/value system for TeX and \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2asvn64578"

RPM_NAME = "texlive-simplekv-2023.209.0.0.2asvn64578-54.1.noarch.rpm"
RPM_HASH = "6c52384c2813489fbacaa6a2e78f243ad35a3966a45fdb5000737d5d1be4ae5ee7008774bb90f5c4c1cb1d51ce7fbaaceabcf7ec96b0aa83962e33dbfc16dace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplekv.sty \
tex-simplekv.tex \
texlive-simplekv"

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
