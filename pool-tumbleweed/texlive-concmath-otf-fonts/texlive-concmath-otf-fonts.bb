SUMMARY = "Severed fonts for texlive-concmath-otf"
DESCRIPTION = "The  separated fonts package for texlive-concmath-otf"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.25svn65683"

RPM_NAME = "texlive-concmath-otf-fonts-2023.201.0.0.25svn65683-53.1.noarch.rpm"
RPM_HASH = "77a6d38884962049705fa7372e50d1291303e347bcc9eab302e710be5f4fb4e73c4b179dd92f4708346de269a23b2ee886c9cf914b58ca7b6b8018ba27c159c9"
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
font-concretemath \
texlive-concmath-otf-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
