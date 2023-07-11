SUMMARY = "Severed fonts for texlive-mdsymbol"
DESCRIPTION = "The  separated fonts package for texlive-mdsymbol"
LICENSE = "OFL-1.1"

PV = "2023.208.0.0.5svn28399"

RPM_NAME = "texlive-mdsymbol-fonts-2023.208.0.0.5svn28399-53.1.noarch.rpm"
RPM_HASH = "179fbdc619da39768d63c783fc62c802362c268601399ba5d87e6346b6fe4553e5edc07eeda2ec1e2078710c14e93ef6fefe3d6dabbc8e3759eb5b03cc611000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-mdsymbol-fonts \
font-mdsymbol \
font-mdsymbola \
font-mdsymbolb \
font-mdsymbolc \
font-mdsymbold \
font-mdsymbole \
font-mdsymbolf \
texlive-mdsymbol-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
