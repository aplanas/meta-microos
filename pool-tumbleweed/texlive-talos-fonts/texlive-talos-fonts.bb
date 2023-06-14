SUMMARY = "Severed fonts for texlive-talos"
DESCRIPTION = "The  separated fonts package for texlive-talos"
LICENSE = "LPPL-1.3c"

PV = "2023.201.1.0svn61820"

RPM_NAME = "texlive-talos-fonts-2023.201.1.0svn61820-54.1.noarch.rpm"
RPM_HASH = "9c9a1dd2779538891fa8c5f33b16d5ed6198c9cd7f101668dcb71a272c256f4e87cbcf1370f8f9bbdff14e684bcd58882fbb1404225ba178c558963ec2d245f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=el \
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
font-talos \
texlive-talos-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
