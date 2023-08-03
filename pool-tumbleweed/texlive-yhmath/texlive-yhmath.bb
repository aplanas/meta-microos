SUMMARY = "Extended maths fonts for LaTeX"
DESCRIPTION = "The yhmath bundle contains fonts (in Metafont and type 1 \
format) and a LaTeX package for using them."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn54377"

RPM_NAME = "texlive-yhmath-2023.209.1.6svn54377-53.1.noarch.rpm"
RPM_HASH = "853f501dce5d276cbcb0678948894ee1c0a43ae17c11cfcd36f115e453f7fdc864852dbd2efd832bb144f0ec0ce54604f8f6bbc0e055663a4beb6d7cd710cb76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OMXyhex.fd \
tex-yhcmex10.tfm \
tex-yhcmex10.vf \
tex-yhmath.map \
tex-yhmath.sty \
tex-yrcmex10.tfm \
texlive-yhmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-yhmath-fonts"

inherit rpm
