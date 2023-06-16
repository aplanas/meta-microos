SUMMARY = "Reduce the number of unnecessary float pages"
DESCRIPTION = "This package implements a float algorithm extension for \
handling float pages. It attempts to reduce the number of \
unnecessary (fairly empty) float pages while making sure that \
floats nevertheless stay close to their call-outs. Several \
aspects of the algorithm behavior are adjustable."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0bsvn58058"

RPM_NAME = "texlive-fewerfloatpages-2023.201.1.0bsvn58058-52.1.noarch.rpm"
RPM_HASH = "fcd8fb987ce0b08a1e0c0bb9bd4c326cec2611df0052eca2505af92f7070873e36e0082cda0d10093b5e8268e8007ad45406aae184f61200e634e19f81e49481"
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
