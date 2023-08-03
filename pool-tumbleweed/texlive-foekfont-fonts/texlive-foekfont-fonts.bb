SUMMARY = "Severed fonts for texlive-foekfont"
DESCRIPTION = "The  separated fonts package for texlive-foekfont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-foekfont-fonts-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "fea21d0d2f7ff4652321eca9a7a6e0f99947f67065c8f9383aa3d26754132771b2137bfdca0477ca70170f33f6941aec0231eaa6247f04c6a4c2399fcab8d3be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-foekfont \
texlive-foekfont-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
