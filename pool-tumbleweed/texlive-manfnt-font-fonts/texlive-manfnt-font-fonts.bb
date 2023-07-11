SUMMARY = "Severed fonts for texlive-manfnt-font"
DESCRIPTION = "The  separated fonts package for texlive-manfnt-font"
LICENSE = "SUSE-TeX"

PV = "2023.208.svn45777"

RPM_NAME = "texlive-manfnt-font-fonts-2023.208.svn45777-53.1.noarch.rpm"
RPM_HASH = "9b51428e355529c889f2cd453669c052601e56e42a8b3d200355f0a4c478726f4e6106cb119c27aef29a13727d511987e7e571f9a0114fdad59d0993f89f281d"
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
