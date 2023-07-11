SUMMARY = "Define textual variants"
DESCRIPTION = "The package provides commands to formalize textual variants in \
critical editions typeset using eledmac."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn38114"

RPM_NAME = "texlive-eledform-2023.201.1.1asvn38114-53.2.noarch.rpm"
RPM_HASH = "61325afdbb8c4cff958fb9330f75cee79b5cd6fb77ac1ce0456b91c3f810420640c26ded45f91121e8605bfb2459e07a4176d98fd6bbecf2a63a0b52c6116180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eledform.sty \
texlive-eledform"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eledmac.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
