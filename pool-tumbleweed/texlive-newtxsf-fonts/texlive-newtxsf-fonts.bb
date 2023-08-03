SUMMARY = "Severed fonts for texlive-newtxsf"
DESCRIPTION = "The  separated fonts package for texlive-newtxsf"
LICENSE = "OFL-1.1"

PV = "2023.209.1.054svn59227"

RPM_NAME = "texlive-newtxsf-fonts-2023.209.1.054svn59227-55.1.noarch.rpm"
RPM_HASH = "dc0f03870568aae3c41829a5b3e0a9847c40af04c2e0548f91c53ec45c64afda928949e6f902e46bd9e453fd26ffd785ccf76560ad729fc2fb3e9ecd6dfe43ef"
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
font-zsfbmi \
font-zsfmi \
font-zsfmia \
texlive-newtxsf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
