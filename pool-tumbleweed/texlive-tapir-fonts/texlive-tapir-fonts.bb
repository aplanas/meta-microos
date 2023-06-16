SUMMARY = "Severed fonts for texlive-tapir"
DESCRIPTION = "The  separated fonts package for texlive-tapir"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn20484"

RPM_NAME = "texlive-tapir-fonts-2023.201.0.0.2svn20484-54.1.noarch.rpm"
RPM_HASH = "166e0104962683285dc8d872f033123f1ece0704ecf38a1f58a21a1255797c5b950b0c54dd8506462c0fc424150c4beedf29be0e659fe8ca8529029109b7c6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=cs \
font--lang=de \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=mg \
font--lang=ms \
font--lang=nds \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sk \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-tapir \
texlive-tapir-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
