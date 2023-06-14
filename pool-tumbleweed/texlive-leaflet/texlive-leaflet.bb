SUMMARY = "Create small handouts (flyers)"
DESCRIPTION = "A document class to create small hand-outs (flyers) that fit on \
a single sheet of paper which is then folded twice. Pages are \
rearranged by LaTeX so that they print correctly on a single \
sheet -- no external script is necessary. (Works with \
PostScript and PDF.) This is a complete reimplementation with \
permission of the original author Jurgen Schlegelmilch."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1asvn56878"

RPM_NAME = "texlive-leaflet-2023.201.2.1asvn56878-54.1.noarch.rpm"
RPM_HASH = "b39860e3a75b9ccfcc7fdb05877d66e7d000e2ef308bf12da666c51059ef4dfa65efd5d6a205dcd703fde93d8371efefd8c65b1689b1092f13b21910c0062dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leaflet.cls \
texlive-leaflet"

RDEPENDS:${PN} += "/bin/sh \
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
