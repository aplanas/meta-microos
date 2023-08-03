SUMMARY = "Severed fonts for texlive-arphic"
DESCRIPTION = "The  separated fonts package for texlive-arphic"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-arphic-fonts-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "b94c40f320ea053c5931808e11445e540fa2a0014136c55de029e86fd1a1becf8d0a1b87d84a112b81be905af527b4e0507ff23ab60691c1e70714cd33a7b7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bg \
font--lang=fj \
font--lang=ho \
font--lang=ia \
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
font--lang=zu \
font-arplkaitimbig5 \
font-arplkaitimgb \
font-arplmingti2lbig5 \
font-arplsungtilgb \
texlive-arphic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
