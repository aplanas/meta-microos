SUMMARY = "A TikZ library for producing Penrose tilings"
DESCRIPTION = "This package provides a TikZ library for drawing Penrose tiles. \
It currently supports the kite/dart, rhombus, and pentagon tile \
sets. There are two main methods for their placement: one that \
automatically generates a tiling, and one that allows for 'by \
hand' placement. Furthermore, the tiles themselves can be \
deformed and will still (hopefully!) fit together in the \
correct fashion."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn57508"

RPM_NAME = "texlive-penrose-2023.209.1.4svn57508-52.1.noarch.rpm"
RPM_HASH = "c2415536cc5d91909bc2272180af1a6c2bf344154709ee6296305f82b60380dc870ad0559b1c6332280183242445039c41a6dbb8b69209fe2d1d8617d3c306b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarypenrose.code.tex \
texlive-penrose"

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
