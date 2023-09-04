SUMMARY = "Extended maths fonts for LaTeX"
DESCRIPTION = "The yhmath bundle contains fonts (in Metafont and type 1 \
format) and a LaTeX package for using them."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn54377"

RPM_NAME = "texlive-yhmath-2023.209.1.6svn54377-53.2.noarch.rpm"
RPM_HASH = "c37698140d403f507c3ee8675012b637ada2d609ece6005156c6389bad41d96c506ddfb433a34eddf945a65ec1bcc718288e2564538898a328952817e2feb944"
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
