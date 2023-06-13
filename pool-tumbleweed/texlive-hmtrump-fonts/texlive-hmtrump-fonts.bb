SUMMARY = "Severed fonts for texlive-hmtrump"
DESCRIPTION = "The  separated fonts package for texlive-hmtrump"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-fonts-2023.201.1.2asvn54512-53.1.noarch.rpm"
RPM_HASH = "8507d37799899ea9ca1463c6c4ff53f535d5f2faa31776d7470af4bb3081150fb0846a9460281ab3226c41630f992d5dea7924b8d3c6c0db5f0019c7e40e17e1"
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
font(nkd04playingcard'sindex) \
texlive-hmtrump-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
