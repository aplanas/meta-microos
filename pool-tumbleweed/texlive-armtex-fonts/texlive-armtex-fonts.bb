SUMMARY = "Severed fonts for texlive-armtex"
DESCRIPTION = "The  separated fonts package for texlive-armtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0_beta4svn64182"

RPM_NAME = "texlive-armtex-fonts-2023.209.3.0_beta4svn64182-55.1.noarch.rpm"
RPM_HASH = "b36444e5e443e019125bd57a2d6b11ed2d760909c6571d998301ef5744819d23f3ff9416a54c7e3df466d1af41567d6941d46fc19efff7af9ab2e49e3ed2418e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-arss \
font-artm \
texlive-armtex-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
