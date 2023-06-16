SUMMARY = "Severed fonts for texlive-manfnt-font"
DESCRIPTION = "The  separated fonts package for texlive-manfnt-font"
LICENSE = "SUSE-TeX"

PV = "2023.201.svn45777"

RPM_NAME = "texlive-manfnt-font-fonts-2023.201.svn45777-52.1.noarch.rpm"
RPM_HASH = "6184f7dedc068ca22dbc79bef0880c0cb660a6f6cd119ee9823cc5f29573399d377d16e64de52d3b98aa20d10df41d3b066f90a3f5e472e21d2cf51ed83f996c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-manfnt \
texlive-manfnt-font-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
