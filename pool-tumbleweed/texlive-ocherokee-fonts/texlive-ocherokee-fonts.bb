SUMMARY = "Severed fonts for texlive-ocherokee"
DESCRIPTION = "The  separated fonts package for texlive-ocherokee"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25689"

RPM_NAME = "texlive-ocherokee-fonts-2023.209.svn25689-55.1.noarch.rpm"
RPM_HASH = "cc9bfdcc5a2e3f40cc718e49d965dbc99d42d46040230d463308ed75f4795e39e6a260b06de79297956d3731f0048320186d333d3164c3ccacd6716d202bcfde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-cherokee \
texlive-ocherokee-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
