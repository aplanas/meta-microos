SUMMARY = "Severed fonts for texlive-gregoriotex"
DESCRIPTION = "The  separated fonts package for texlive-gregoriotex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.6.0.0svn58331"

RPM_NAME = "texlive-gregoriotex-fonts-2023.209.6.0.0svn58331-54.2.noarch.rpm"
RPM_HASH = "192fde1661937ec7c2e466bc4444677063c4cc386747a0b3bf71a1e8c95bc49d37d7d8c3e2bae00086229dc6080c20c32cf6b6dc7baaedd5d818f3b1238a4957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-greciliae \
font-greciliae-hole \
font-greciliae-hollow \
font-greciliae-op \
font-greciliae-op-hole \
font-greciliae-op-hollow \
font-greextra \
font-gregall \
font-grelaon \
font-gresgmodern \
texlive-gregoriotex-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
