SUMMARY = "Support for writing about xiangqi"
DESCRIPTION = "The package is for writing about xiangqi or chinese chess. You \
can write games or parts of games and show diagrams with \
special positions."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn35211"

RPM_NAME = "texlive-xq-2023.209.0.0.4svn35211-53.2.noarch.rpm"
RPM_HASH = "f6d5e7d25e112011d8d2247277269ca89fd2c92356bb9e5a1aac395419b08c8cb0334caa82f08b6dc4e116195a47b70dab072dd8174c2348ad4f81f59175daca"
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
