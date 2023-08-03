SUMMARY = "Severed fonts for texlive-fontawesome5"
DESCRIPTION = "The  separated fonts package for texlive-fontawesome5"
LICENSE = "OFL-1.1"

PV = "2023.209.5.15.4svn63207"

RPM_NAME = "texlive-fontawesome5-fonts-2023.209.5.15.4svn63207-53.1.noarch.rpm"
RPM_HASH = "c8a2ffb275cde7a0b8869640362a9470ceeda97a17208267b77a1bf26a46ea774982022451f1ae9650cb49ce2db39b408bd09eb5bd54102fabbbe6dd2a0b0492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fontawesome5-fonts \
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
font-fontawesome5brands \
font-fontawesome5brandsregular \
font-fontawesome5free \
font-fontawesome5freeregular \
font-fontawesome5freesolid \
texlive-fontawesome5-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
