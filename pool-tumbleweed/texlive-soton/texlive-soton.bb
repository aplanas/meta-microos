SUMMARY = "University of Southampton-compliant slides"
DESCRIPTION = "The bundle contains two packages: soton-palette which defines \
colour-ways, and soton-beamer, which uses the colours to \
produce compliant presentations."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn16215"

RPM_NAME = "texlive-soton-2023.201.0.0.1svn16215-57.1.noarch.rpm"
RPM_HASH = "03305d7f52b7cd4c7dee6a21c4bf82176d38c2f23118e0bf8c292a2477bd9b29da1d61981edd9ff480a33bf1e68692d58302a8e775e2a5bc40f0791e49205cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(soton-beamer.sty) \
tex(soton-palette.sty) \
texlive-soton"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
