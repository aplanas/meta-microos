SUMMARY = "Extended maths fonts for LaTeX"
DESCRIPTION = "The yhmath bundle contains fonts (in Metafont and type 1 \
format) and a LaTeX package for using them."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn54377"

RPM_NAME = "texlive-yhmath-2023.201.1.6svn54377-52.2.noarch.rpm"
RPM_HASH = "a7d7a2303b1c2826ccd65e69734e1aa6068dde4beaba9500fda9ff0d964ab45ec78315a5bafe171d603d7b753d2e2f32235c7ba7fd9d5030b6ded1a9992497d0"
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
