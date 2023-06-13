SUMMARY = "Severed fonts for texlive-hfbright"
DESCRIPTION = "The  separated fonts package for texlive-hfbright"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-hfbright-fonts-2023.201.svn29349-53.1.noarch.rpm"
RPM_HASH = "1412c365bc2320415f28c9ef05b42abb49b859ccc3cc399f1a389ed1fb3985fecb3eec10b485949877c6396a42d0532b5033d1a241d8735b2754db83981ad86f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=fj) \
font(:lang=ho) \
font(:lang=ia) \
font(:lang=io) \
font(:lang=kj) \
font(:lang=kwm) \
font(:lang=ms) \
font(:lang=ng) \
font(:lang=nr) \
font(:lang=om) \
font(:lang=rn) \
font(:lang=rw) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=sw) \
font(:lang=ts) \
font(:lang=uz) \
font(:lang=xh) \
font(:lang=za) \
font(:lang=zu) \
font(computermodernbright) \
texlive-hfbright-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
