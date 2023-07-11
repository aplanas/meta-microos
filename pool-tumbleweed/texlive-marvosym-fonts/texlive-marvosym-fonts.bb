SUMMARY = "Severed fonts for texlive-marvosym"
DESCRIPTION = "The  separated fonts package for texlive-marvosym"
LICENSE = "OFL-1.1"

PV = "2023.208.2.2asvn29349"

RPM_NAME = "texlive-marvosym-fonts-2023.208.2.2asvn29349-53.1.noarch.rpm"
RPM_HASH = "18de3744525e6529235cabd7a37e24b58e7cc5d34088dc3912c51853ffcae00279fbb23463d1d696b2233108322c02f120bb26cc803123165e931330218e6f35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-marvosym-fonts \
font-marvosym \
font-marvosymwithtexsupport \
texlive-marvosym-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
