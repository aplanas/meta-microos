SUMMARY = "Severed fonts for texlive-newtxsf"
DESCRIPTION = "The  separated fonts package for texlive-newtxsf"
LICENSE = "OFL-1.1"

PV = "2023.201.1.054svn59227"

RPM_NAME = "texlive-newtxsf-fonts-2023.201.1.054svn59227-54.1.noarch.rpm"
RPM_HASH = "c4967cde5c690081581c410f3785935bfd7d4aa1e13f90a14a9782e736ae18584dea49fd372370c75d31a55baef79072eef6cfc5d8b5db1be9ff708f6dd4d543"
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
font-zsfbmi \
font-zsfmi \
font-zsfmia \
texlive-newtxsf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
