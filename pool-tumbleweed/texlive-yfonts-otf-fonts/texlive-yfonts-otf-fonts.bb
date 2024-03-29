SUMMARY = "Severed fonts for texlive-yfonts-otf"
DESCRIPTION = "The  separated fonts package for texlive-yfonts-otf"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.43svn65030"

RPM_NAME = "texlive-yfonts-otf-fonts-2023.209.0.0.43svn65030-53.2.noarch.rpm"
RPM_HASH = "f99d80e6c3278ec570dcd1e513807494d88dd3b3fedb67fdd261dad57ec65afa960b7cf29e1bfd642b09a87ddc3e3b0304fb252ea802852a094bbd39cc484a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bi \
font--lang=de \
font--lang=fj \
font--lang=gd \
font--lang=gv \
font--lang=ho \
font--lang=ht \
font--lang=ia \
font--lang=id \
font--lang=io \
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=kwm \
font--lang=li \
font--lang=ms \
font--lang=nds \
font--lang=ng \
font--lang=nr \
font--lang=oc \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sc \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-yfrak \
font-ygoth \
font-yswab \
texlive-yfonts-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
