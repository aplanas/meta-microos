SUMMARY = "Severed fonts for texlive-boondox"
DESCRIPTION = "The  separated fonts package for texlive-boondox"
LICENSE = "OFL-1.1"

PV = "2023.201.1.02dsvn54512"

RPM_NAME = "texlive-boondox-fonts-2023.201.1.02dsvn54512-52.1.noarch.rpm"
RPM_HASH = "6218e3336cbfa1c10b098fcde6351c7664c3d336361b2e1fa4e70a69d9a797c518dcbabfea977a575a430ab9c626eef18e32b0ae6994f049224ed003d25fc6fe"
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
font-boondoxcalligraphic \
font-boondoxdoublestruck \
font-boondoxfraktur \
font-boondoxuprscr \
texlive-boondox-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
