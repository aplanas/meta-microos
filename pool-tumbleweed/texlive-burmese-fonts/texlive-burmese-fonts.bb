SUMMARY = "Severed fonts for texlive-burmese"
DESCRIPTION = "The  separated fonts package for texlive-burmese"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25185"

RPM_NAME = "texlive-burmese-fonts-2023.201.svn25185-52.1.noarch.rpm"
RPM_HASH = "5878bd37f0aa002d53a043ed5ddf598adc21a9894e8a2a24f122c3cac9260cd26d8dbef5920abe8286fdeca788bcbc01548ef69a77b14fd4c37d035428d945d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=fj) \
font(:lang=ho) \
font(:lang=ia) \
font(:lang=id) \
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
font(:lang=su) \
font(:lang=sw) \
font(:lang=ts) \
font(:lang=uz) \
font(:lang=xh) \
font(:lang=za) \
font(:lang=zu) \
font(burma) \
texlive-burmese-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
