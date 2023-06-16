SUMMARY = "Severed fonts for texlive-punknova"
DESCRIPTION = "The  separated fonts package for texlive-punknova"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.003svn24649"

RPM_NAME = "texlive-punknova-fonts-2023.201.1.003svn24649-53.1.noarch.rpm"
RPM_HASH = "8c212f75cb1389b6d0c61ca0742b92b75499a3e928327075268f0e2b4b7ce4dba1ac63fcbb8a48c2d88c7103ef8abb8a16d8c524c581f82139fd94843f839167"
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
font-punknova \
texlive-punknova-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
