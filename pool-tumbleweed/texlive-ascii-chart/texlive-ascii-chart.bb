SUMMARY = "An ASCII wall chart"
DESCRIPTION = "The document may be converted between Plain TeX and LaTeX \
(2.09) by a simple editing action."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20536"

RPM_NAME = "texlive-ascii-chart-2023.201.svn20536-53.1.noarch.rpm"
RPM_HASH = "45921a6326084da79ecd40f359adc1c6585704456f5a7fe803b1a5da5ecd31bad65ed8fe7a6a71edef97f551f1687c8756ea0cf2d6877866898801650d6e5967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ascii-chart"

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
