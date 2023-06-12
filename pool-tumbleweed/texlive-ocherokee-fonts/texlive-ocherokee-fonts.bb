SUMMARY = "Severed fonts for texlive-ocherokee"
DESCRIPTION = "The  separated fonts package for texlive-ocherokee"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25689"

RPM_NAME = "texlive-ocherokee-fonts-2023.201.svn25689-54.1.noarch.rpm"
RPM_HASH = "cd4cdae60fe652faaab3e337db2f02bb79e51a6ccb0b9d0955b9b829489ec6420210b34b54a45d5d9d2d8cd481753f32145d100467bfd2cc26b7567092d33819"
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
font(cherokee) \
texlive-ocherokee-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
