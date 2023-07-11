SUMMARY = "Severed fonts for texlive-punknova"
DESCRIPTION = "The  separated fonts package for texlive-punknova"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.003svn24649"

RPM_NAME = "texlive-punknova-fonts-2023.201.1.003svn24649-53.2.noarch.rpm"
RPM_HASH = "d0a489874ee437a12f35516b89c179d820a4b8e1615e7c00816211e2e87aba1f9b4d11b755e27d500780dfb4fcfb74b479b185a56220114f8358792cd30ce44d"
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
