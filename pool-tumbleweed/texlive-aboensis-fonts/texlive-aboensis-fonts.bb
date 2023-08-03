SUMMARY = "Severed fonts for texlive-aboensis"
DESCRIPTION = "The  separated fonts package for texlive-aboensis"
LICENSE = "OFL-1.1"

PV = "2023.209.svn62977"

RPM_NAME = "texlive-aboensis-fonts-2023.209.svn62977-55.1.noarch.rpm"
RPM_HASH = "c3edc256400d730fea841f54248f4ece65b74430220cbee733265d363e3dce2c5ca4d34a25d6d272db81d20f156a0657fa97fc067cf46df42d0abde4dc4851ec"
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
font-aboensis \
texlive-aboensis-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
