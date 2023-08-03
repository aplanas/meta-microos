SUMMARY = "Severed fonts for texlive-frederika2016"
DESCRIPTION = "The  separated fonts package for texlive-frederika2016"
LICENSE = "OFL-1.1"

PV = "2023.209.1.000_2016_initial_releasesvn42157"

RPM_NAME = "texlive-frederika2016-fonts-2023.209.1.000_2016_initial_releasesvn42157-53.1.noarch.rpm"
RPM_HASH = "ccc8914789194fafb8bd1773debae3cf3fb4d0b0c41e296e2ee5603e103c82d98f6b7757760177c8f986e378f7c27f8f9848859ccbe63ee44046b5c734d75e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=el \
font-frederika2016 \
texlive-frederika2016-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
