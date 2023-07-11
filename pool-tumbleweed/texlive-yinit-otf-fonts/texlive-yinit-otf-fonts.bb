SUMMARY = "Severed fonts for texlive-yinit-otf"
DESCRIPTION = "The  separated fonts package for texlive-yinit-otf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-fonts-2023.201.1.0svn40207-52.2.noarch.rpm"
RPM_HASH = "b65ce6b176b05b628d927e580cc5b5b0fed750406ff39d245ee7258c59c9d53856dc417b5d083885f7d50e29e1136976ce9cc25c48c09ad8ad1adf170336ac2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-yinit \
texlive-yinit-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
