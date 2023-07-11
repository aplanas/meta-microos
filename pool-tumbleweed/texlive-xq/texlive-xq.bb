SUMMARY = "Support for writing about xiangqi"
DESCRIPTION = "The package is for writing about xiangqi or chinese chess. You \
can write games or parts of games and show diagrams with \
special positions."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn35211"

RPM_NAME = "texlive-xq-2023.201.0.0.4svn35211-52.2.noarch.rpm"
RPM_HASH = "392d11e3c969bc554e1c6e5f5f86a6a2aa302bf02a62392d0c2d300632e0ba018ce3e89d1dcb14e022ea41219b38f3b84c84dec0f0072a6ac19ca4a6942546a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xq.sty \
tex-xqlarge.tfm \
tex-xqnormal.tfm \
texlive-xq"

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
