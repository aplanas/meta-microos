SUMMARY = "Severed fonts for texlive-uhc"
DESCRIPTION = "The  separated fonts package for texlive-uhc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn16791"

RPM_NAME = "texlive-uhc-fonts-2023.209.svn16791-54.1.noarch.rpm"
RPM_HASH = "d81e2478aa270950be0d4172544edd4e0186673c8a040ffe2f3904fbd0c848ac91cdde5a4344362395cdd0f5e2ddb8d3396b43dc5233cbcef06aed2d36dbb18a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bg \
font--lang=kum \
font--lang=os \
font--lang=ru \
font--lang=sel \
font-umj00 \
font-umj01 \
font-umj02 \
font-umj03 \
font-umj04 \
font-umj05 \
font-umj10 \
font-umj11 \
font-umj12 \
font-umj13 \
font-umj14 \
font-umj15 \
font-umj16 \
font-umj17 \
font-umj20 \
font-umj21 \
font-umj22 \
font-umj23 \
font-umj24 \
font-umj25 \
font-umj26 \
font-umj27 \
font-umj28 \
font-umj29 \
font-umj30 \
font-umj31 \
font-umj32 \
font-umj33 \
font-umj34 \
font-umj35 \
font-umj36 \
font-umj37 \
font-umj38 \
texlive-uhc-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
