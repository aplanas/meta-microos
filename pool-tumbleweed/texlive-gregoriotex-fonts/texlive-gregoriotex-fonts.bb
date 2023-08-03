SUMMARY = "Severed fonts for texlive-gregoriotex"
DESCRIPTION = "The  separated fonts package for texlive-gregoriotex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.6.0.0svn58331"

RPM_NAME = "texlive-gregoriotex-fonts-2023.209.6.0.0svn58331-54.1.noarch.rpm"
RPM_HASH = "6d2a0cc272f11b456bd811c60f0091115fd933c4aee308e545d5160e47a603af02e911c4768a6097a662fde475502806ec7b7f5bd7af61394931f917c17b5d2d"
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
