SUMMARY = "Severed fonts for texlive-chemarrow"
DESCRIPTION = "The  separated fonts package for texlive-chemarrow"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.9svn17146"

RPM_NAME = "texlive-chemarrow-fonts-2023.201.0.0.9svn17146-53.1.noarch.rpm"
RPM_HASH = "98516947d6e6cfe527d1728f7bbffaba4f153dbe125003c0427458f81ccdd51e9c9e27a9d2c4ad2338cda4afbf6163e8a86cc78d079a6815101c2083449121d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-arrow \
texlive-chemarrow-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
