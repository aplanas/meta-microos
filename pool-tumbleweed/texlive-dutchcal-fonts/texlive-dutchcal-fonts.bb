SUMMARY = "Severed fonts for texlive-dutchcal"
DESCRIPTION = "The  separated fonts package for texlive-dutchcal"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-dutchcal-fonts-2023.201.1.0svn54080-52.1.noarch.rpm"
RPM_HASH = "e85c81a02a5fa4e400e2bd03839d24f367db5d602e61ab4adfd4115126a0abe4efb785da990b37277ca37269fd11e72af12639d515bec163f56ecd0d9c7890f0"
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
font(dutchcalligraphic) \
texlive-dutchcal-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
