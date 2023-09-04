SUMMARY = "Severed fonts for texlive-yinit-otf"
DESCRIPTION = "The  separated fonts package for texlive-yinit-otf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-fonts-2023.209.1.0svn40207-53.2.noarch.rpm"
RPM_HASH = "3dd72e56f70472887e53386ba8d4c332464d5f2f7ecd8cf2ee80e62700b70dc439e5eecbe89af88ea05a501ca499496ce590668ec7a16f35ede8958ce2020a67"
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
