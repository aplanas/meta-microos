SUMMARY = "Create small handouts (flyers)"
DESCRIPTION = "A document class to create small hand-outs (flyers) that fit on \
a single sheet of paper which is then folded twice. Pages are \
rearranged by LaTeX so that they print correctly on a single \
sheet -- no external script is necessary. (Works with \
PostScript and PDF.) This is a complete reimplementation with \
permission of the original author Jurgen Schlegelmilch."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1asvn56878"

RPM_NAME = "texlive-leaflet-2023.209.2.1asvn56878-55.1.noarch.rpm"
RPM_HASH = "03e1cd0219f64309a983a9525af5b5ad951728346b6f49fe6bf96c9117b3e4c244e20b5f9c82a2ac6a0daf3ced3a8d3b83c6ff0b4694fa687102afc1a4996e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leaflet.cls \
texlive-leaflet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-etex.sty \
tex-graphicx.sty \
tex-pifont.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
