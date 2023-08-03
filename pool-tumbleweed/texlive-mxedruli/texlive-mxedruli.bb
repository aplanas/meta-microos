SUMMARY = "A pair of fonts for different Georgian alphabets"
DESCRIPTION = "Two Georgian fonts, in both Metafont and Type 1 formats, which \
cover the Mxedruli and the Xucuri alphabets."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.3csvn30021"

RPM_NAME = "texlive-mxedruli-2023.209.3.3csvn30021-55.1.noarch.rpm"
RPM_HASH = "79f0a4c34ae6b76224f53ad74b77d342927b92ee474c52153589a7ea52620d627f8e7495856f4a44536498dfe91a32c706aaba42725a19a906299477317ff519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mxed10.tfm \
tex-mxedbf10.tfm \
tex-mxedc10.tfm \
tex-mxedi10.tfm \
tex-mxedruli.map \
tex-mxedruli.sty \
tex-umxed.fd \
tex-uxuc.fd \
tex-xuc10.tfm \
tex-xucuri.sty \
texlive-mxedruli"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mxedruli-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
