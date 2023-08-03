SUMMARY = "Severed fonts for texlive-mnsymbol"
DESCRIPTION = "The  separated fonts package for texlive-mnsymbol"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.4svn18651"

RPM_NAME = "texlive-mnsymbol-fonts-2023.209.1.4svn18651-55.1.noarch.rpm"
RPM_HASH = "3674c744e80e6778e74830b595adb981f8aa108edc0e96119101637a539a09c90630e6c0a5aba100cbc2777c5e1c140a8c613fc8e4df31ec144c3c8743d6144c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-mnsymbol-fonts \
font-mnsymbol \
texlive-mnsymbol-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
