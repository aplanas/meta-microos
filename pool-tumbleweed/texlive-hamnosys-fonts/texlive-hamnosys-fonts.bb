SUMMARY = "Severed fonts for texlive-hamnosys"
DESCRIPTION = "The  separated fonts package for texlive-hamnosys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-fonts-2023.201.1.0.3svn61941-53.1.noarch.rpm"
RPM_HASH = "57da4a4defe4120e63ad524437644a8a0511224227e5e83183712cb282380669bdf5f1ecd4ab0d0da7821b4c8b1287ac036be6fd4ddf8b5d1cd8cb58d9c5e58f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(hamnosysunicode) \
texlive-hamnosys-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
