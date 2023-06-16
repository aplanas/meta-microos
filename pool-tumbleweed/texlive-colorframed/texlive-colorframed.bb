SUMMARY = "Fix color problems with the package 'framed'"
DESCRIPTION = "This package fixes problems with colour loss that occurres in \
the environments of the framed package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9bsvn64551"

RPM_NAME = "texlive-colorframed-2023.201.0.0.9bsvn64551-53.1.noarch.rpm"
RPM_HASH = "944cff6ef3fe08c1b7755bcb06f6aaa3a195c9d088d3f674cb0424869ce7c1ef41a55a5ef671fb3034b3cda961d858c29988be043b8d81f0f3926b7be9d8a3e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorframed.sty \
texlive-colorframed"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-framed.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
