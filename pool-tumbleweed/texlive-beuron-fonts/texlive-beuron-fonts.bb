SUMMARY = "Severed fonts for texlive-beuron"
DESCRIPTION = "The  separated fonts package for texlive-beuron"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn46374"

RPM_NAME = "texlive-beuron-fonts-2023.209.1.3svn46374-54.1.noarch.rpm"
RPM_HASH = "afc20df32088ab652c69afe4313040ee66a047bf7645e59a4208c0fe72f2ab1ce142fa906b356d8ae9561c86e7176ebb6e1ec2c7c2a84dc9f6b67ac9161051a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-beuron-fonts \
font--lang=fj \
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
font-beuron \
font-beuroncondensed \
font-beuronextended \
texlive-beuron-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
