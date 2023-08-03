SUMMARY = "Severed fonts for texlive-burmese"
DESCRIPTION = "The  separated fonts package for texlive-burmese"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25185"

RPM_NAME = "texlive-burmese-fonts-2023.209.svn25185-53.1.noarch.rpm"
RPM_HASH = "f93c43c3b961408cfead0f319b0be7e869f2a9dbf59b869b731305eddab731e891d0800ac880fb4bdc38c193050a4369af2386bccb6ebbdeb44eb159716d920e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=id \
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
font--lang=su \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-burma \
texlive-burmese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
