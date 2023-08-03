SUMMARY = "Support for writing about xiangqi"
DESCRIPTION = "The package is for writing about xiangqi or chinese chess. You \
can write games or parts of games and show diagrams with \
special positions."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn35211"

RPM_NAME = "texlive-xq-2023.209.0.0.4svn35211-53.1.noarch.rpm"
RPM_HASH = "9d457a3e760a0505f29699ab5cdb11038af1445831a30239c4e144f596211320703f6fe0f7c082139eaa45177809a044ff8763a7cf8916ef530f5a7f9123f0db"
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
