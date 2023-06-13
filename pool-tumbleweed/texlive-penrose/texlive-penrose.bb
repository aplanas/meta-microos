SUMMARY = "A TikZ library for producing Penrose tilings"
DESCRIPTION = "This package provides a TikZ library for drawing Penrose tiles. \
It currently supports the kite/dart, rhombus, and pentagon tile \
sets. There are two main methods for their placement: one that \
automatically generates a tiling, and one that allows for 'by \
hand' placement. Furthermore, the tiles themselves can be \
deformed and will still (hopefully!) fit together in the \
correct fashion."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn57508"

RPM_NAME = "texlive-penrose-2023.201.1.4svn57508-51.1.noarch.rpm"
RPM_HASH = "8f2f7211e39d08cdd0527989dab682db9b4df73c47b63f3752b679f130145dd35c34d607c3a627343d6238e2035c3ed6512bf52b02ba510e450af58f5137834c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzlibrarypenrose.code.tex) \
texlive-penrose"

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
