SUMMARY = "Severed fonts for texlive-gregoriotex"
DESCRIPTION = "The  separated fonts package for texlive-gregoriotex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.6.0.0svn58331"

RPM_NAME = "texlive-gregoriotex-fonts-2023.201.6.0.0svn58331-53.2.noarch.rpm"
RPM_HASH = "b3fd6bda68792be9b287dc7ae2b2832cd5b714ecf5d040b2c105f0323a6757e2530b87529c1c186a7846520346058fb0132b5764e0f9c109a96f645f896b3a2b"
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
