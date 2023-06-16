SUMMARY = "Severed fonts for texlive-beuron"
DESCRIPTION = "The  separated fonts package for texlive-beuron"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn46374"

RPM_NAME = "texlive-beuron-fonts-2023.201.1.3svn46374-53.1.noarch.rpm"
RPM_HASH = "509d24cf67b64917d28e34db4214abee15e0fb427f7d6e9ff403b46a789dd5108e0902662d823b4bf98512eb49684f0da541e04b427d05810ca3c6be13fe3f38"
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
