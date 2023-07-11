SUMMARY = "Severed fonts for texlive-luapstricks"
DESCRIPTION = "The  separated fonts package for texlive-luapstricks"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.8svn65913"

RPM_NAME = "texlive-luapstricks-fonts-2023.208.0.0.8svn65913-53.1.noarch.rpm"
RPM_HASH = "55ad9e63738e16ef4f93e77bdd6c9ae6dfd8b70ffa2d29e7d320694bdb31af3ad4e67e0973db3a57b4724f968f0aa69526a4e72c1c2c957a0dc63c002ca479c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-pstricksdotfont \
texlive-luapstricks-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
