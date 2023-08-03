SUMMARY = "Severed fonts for texlive-dozenal"
DESCRIPTION = "The  separated fonts package for texlive-dozenal"
LICENSE = "LPPL-1.0"

PV = "2023.209.7.2svn47680"

RPM_NAME = "texlive-dozenal-fonts-2023.209.7.2svn47680-53.1.noarch.rpm"
RPM_HASH = "12c7436ed53752d54c0f1e3cd7928a1c921f6a91f289b023826df640c807d61453b51c0d0206a67fc8cb6ae02e6b8cbcbbef912ff2f9530ce331f065f2673c58"
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
font-dozchars10 \
font-dozchars12 \
font-dozchars17 \
font-dozchars6 \
font-dozchars7 \
font-dozchars8 \
font-dozchars9 \
font-dozchb10 \
font-dozchbx10 \
font-dozchbx12 \
font-dozchbx5 \
font-dozchbx6 \
font-dozchbx7 \
font-dozchbx8 \
font-dozchbx9 \
font-dozchbxi10 \
font-dozchbxsl10 \
font-dozchit10 \
font-dozchit12 \
font-dozchit7 \
font-dozchit8 \
font-dozchit9 \
font-dozchsl10 \
font-dozchsl12 \
font-dozchsl8 \
font-dozchsl9 \
texlive-dozenal-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
