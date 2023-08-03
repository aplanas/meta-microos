SUMMARY = "Severed fonts for texlive-yinit-otf"
DESCRIPTION = "The  separated fonts package for texlive-yinit-otf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-fonts-2023.209.1.0svn40207-53.1.noarch.rpm"
RPM_HASH = "c62fc12b429ee7c405036e2ada09039c4c6ef6f3dbd3f4f8d3477a2019e83d8ec051d2229f7f6854895d0925c44fd5346dc8261ad6ac6e3c7979610549f2c4ad"
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
