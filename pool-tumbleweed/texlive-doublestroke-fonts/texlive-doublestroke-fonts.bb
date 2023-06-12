SUMMARY = "Severed fonts for texlive-doublestroke"
DESCRIPTION = "The  separated fonts package for texlive-doublestroke"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.111svn15878"

RPM_NAME = "texlive-doublestroke-fonts-2023.201.1.111svn15878-52.1.noarch.rpm"
RPM_HASH = "f5a06d04fee1c2a5f43746955081f7ea0fd50451824a7d0eb28c5cfda8a120e80c585ad0722f90d37ce9a0b3ea0149f0f8095be2d15e862e7c9fa45b5ca17b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(dsrom10) \
font(dsrom12) \
font(dsrom8) \
font(dsss10) \
font(dsss12) \
font(dsss8) \
texlive-doublestroke-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
