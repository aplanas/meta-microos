SUMMARY = "Severed fonts for texlive-padauk"
DESCRIPTION = "The  separated fonts package for texlive-padauk"
LICENSE = "OFL-1.1"

PV = "2023.201.3.002svn42617"

RPM_NAME = "texlive-padauk-fonts-2023.201.3.002svn42617-51.1.noarch.rpm"
RPM_HASH = "1c3e5dafdf85bf45c8cef24bd370f9c73fee457ec59183e70a335714d10e4cb66ec0ed4bcc193f2ea9b09641bb77a87119cf9c23a01188464cb12d648f06b414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=fj) \
font(:lang=ho) \
font(:lang=ia) \
font(:lang=io) \
font(:lang=kj) \
font(:lang=kwm) \
font(:lang=ms) \
font(:lang=my) \
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
font(padauk) \
font(padaukbook) \
texlive-padauk-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
