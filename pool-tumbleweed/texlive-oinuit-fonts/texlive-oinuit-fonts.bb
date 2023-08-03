SUMMARY = "Severed fonts for texlive-oinuit"
DESCRIPTION = "The  separated fonts package for texlive-oinuit"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28668"

RPM_NAME = "texlive-oinuit-fonts-2023.209.svn28668-55.1.noarch.rpm"
RPM_HASH = "837e2fa53464427d4e84ca6f5b67a40b23f293acf2b89c97267db64d560a4af4c5c2a61f250576d6614773c2aa0ff3cee9978571b9329b3fa3328efe04359f53"
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
font-computer \
font-inuit \
texlive-oinuit-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
