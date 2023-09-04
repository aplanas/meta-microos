SUMMARY = "Severed fonts for texlive-zapfding"
DESCRIPTION = "The  separated fonts package for texlive-zapfding"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-zapfding-fonts-2023.209.svn61719-53.2.noarch.rpm"
RPM_HASH = "413b5a45e3a2e8462f215bb9d4d1de98c0275546d66e5792df21229d88d3b1bc0c0ac65e2ea08664cd118166c661581d42a9ab4892abad674e2c8180768ae3c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-dingbats \
texlive-zapfding-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
