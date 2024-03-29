SUMMARY = "Severed fonts for texlive-epiolmec"
DESCRIPTION = "The  separated fonts package for texlive-epiolmec"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-epiolmec-fonts-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "2446eafba1e97714807ab4402598f19e1531c15168bb4c1fecee755b4477c3e094ee627eccbe36426200081654fad51222580e05b1712b9324b4266a6978a57b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=lg \
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
font-epi-olmce \
texlive-epiolmec-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
