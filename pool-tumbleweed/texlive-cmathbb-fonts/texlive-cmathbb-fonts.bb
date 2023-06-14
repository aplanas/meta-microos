SUMMARY = "Severed fonts for texlive-cmathbb"
DESCRIPTION = "The  separated fonts package for texlive-cmathbb"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56414"

RPM_NAME = "texlive-cmathbb-fonts-2023.201.1.0svn56414-53.1.noarch.rpm"
RPM_HASH = "bb27b91ce31fffca147bb5a5a7291faf9725a16dcf7e4adc3362fdcc807a01273cb6445d4e4553beb274d0c248ae8e8ecb6048a495c5c092a5355245c33a21cf"
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
font-cmathbb \
texlive-cmathbb-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
