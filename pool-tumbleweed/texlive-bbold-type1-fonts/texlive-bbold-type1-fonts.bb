SUMMARY = "Severed fonts for texlive-bbold-type1"
DESCRIPTION = "The  separated fonts package for texlive-bbold-type1"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn33143"

RPM_NAME = "texlive-bbold-type1-fonts-2023.209.svn33143-54.1.noarch.rpm"
RPM_HASH = "fd409a6083cbd621575f51b59f4f31c188fcb2edd5656b226e391aea2431d4c75c272f50adcb7a359edd64e99142d698e7e99f1f35f001786a8daaf2387ec61f"
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
font-bbold \
texlive-bbold-type1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
