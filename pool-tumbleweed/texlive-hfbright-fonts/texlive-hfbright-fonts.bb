SUMMARY = "Severed fonts for texlive-hfbright"
DESCRIPTION = "The  separated fonts package for texlive-hfbright"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-hfbright-fonts-2023.209.svn29349-54.1.noarch.rpm"
RPM_HASH = "8cbe814e65774ff59e974e91fcf560f13f218df4f52d55271f572c0144f1fbe686b626671dede87a16ef7b8423ac228b47ef8377acb6bbba4e8eeda52f976c4b"
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
font-computermodernbright \
texlive-hfbright-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
