SUMMARY = "Reduce the number of unnecessary float pages"
DESCRIPTION = "This package implements a float algorithm extension for \
handling float pages. It attempts to reduce the number of \
unnecessary (fairly empty) float pages while making sure that \
floats nevertheless stay close to their call-outs. Several \
aspects of the algorithm behavior are adjustable."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0bsvn58058"

RPM_NAME = "texlive-fewerfloatpages-2023.209.1.0bsvn58058-53.1.noarch.rpm"
RPM_HASH = "9f18e36386a0521a1f685a62e54c6e701cc2a9903478a3bb1b500ab78de6807efc918a7bb055ecec9263ec1064b743a394826b6e09545ae3d58eb9873a81afbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fewerfloatpages.sty \
texlive-fewerfloatpages"

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
