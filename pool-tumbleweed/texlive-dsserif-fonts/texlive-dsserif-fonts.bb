SUMMARY = "Severed fonts for texlive-dsserif"
DESCRIPTION = "The  separated fonts package for texlive-dsserif"
LICENSE = "OFL-1.1"

PV = "2023.201.1.031svn60898"

RPM_NAME = "texlive-dsserif-fonts-2023.201.1.031svn60898-52.1.noarch.rpm"
RPM_HASH = "3bd706e1ce9d462e2462f49393574092d8f8226f34782d879a79aa6242b14d95cc735b96d3249f7cbe5b803828c0155e719abac518bcb84dc1e27948d528685b"
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
font(dsserif) \
font(dsserifuni) \
texlive-dsserif-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
