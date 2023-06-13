SUMMARY = "Severed fonts for texlive-phaistos"
DESCRIPTION = "The  separated fonts package for texlive-phaistos"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn18651"

RPM_NAME = "texlive-phaistos-fonts-2023.201.1.0svn18651-51.1.noarch.rpm"
RPM_HASH = "bc922ff50ad5d7ebf77b758f27f8c755558a72ef52e465ddc2781f87ffa4d6bf29cb2ad4c63f7481a091ef49336c1cf3fa652b693712ef042129f17ff0a5a7ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-phaistos-fonts) \
font(phaistos) \
texlive-phaistos-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
