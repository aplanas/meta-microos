SUMMARY = "Severed fonts for texlive-dozenal"
DESCRIPTION = "The  separated fonts package for texlive-dozenal"
LICENSE = "LPPL-1.0"

PV = "2023.201.7.2svn47680"

RPM_NAME = "texlive-dozenal-fonts-2023.201.7.2svn47680-52.1.noarch.rpm"
RPM_HASH = "3acb8c524691cca459e8feafb8cc28df9b89de2cc85d2f9f4a534334db779c4dcba0b6d8b6d05939d9ea8c24d4ae1bb5495a09a9f05792a2edefc5965765988a"
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
font(dozchars10) \
font(dozchars12) \
font(dozchars17) \
font(dozchars6) \
font(dozchars7) \
font(dozchars8) \
font(dozchars9) \
font(dozchb10) \
font(dozchbx10) \
font(dozchbx12) \
font(dozchbx5) \
font(dozchbx6) \
font(dozchbx7) \
font(dozchbx8) \
font(dozchbx9) \
font(dozchbxi10) \
font(dozchbxsl10) \
font(dozchit10) \
font(dozchit12) \
font(dozchit7) \
font(dozchit8) \
font(dozchit9) \
font(dozchsl10) \
font(dozchsl12) \
font(dozchsl8) \
font(dozchsl9) \
texlive-dozenal-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
