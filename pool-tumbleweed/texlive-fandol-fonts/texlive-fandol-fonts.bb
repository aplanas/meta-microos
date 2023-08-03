SUMMARY = "Severed fonts for texlive-fandol"
DESCRIPTION = "The  separated fonts package for texlive-fandol"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3svn37889"

RPM_NAME = "texlive-fandol-fonts-2023.209.0.0.3svn37889-53.1.noarch.rpm"
RPM_HASH = "79fecfd7a1398b20ade51ad40773bca27de2bd08f6159af263f4405f8fcd6bc05538cba71b6fef3aab01270240c366613c5e9a8d19abccbc73563318a3f8e41e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bg \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=ii \
font--lang=io \
font--lang=kj \
font--lang=kum \
font--lang=kwm \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=os \
font--lang=rn \
font--lang=ru \
font--lang=rw \
font--lang=sel \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zh-cn \
font--lang=zh-sg \
font--lang=zu \
font-fandolbraille \
font-fandolbrailledisplay \
font-fandolbrailleregular \
font-fandolfang \
font-fandolfangr \
font-fandolhei \
font-fandolkai \
font-fandolsong \
texlive-fandol-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
