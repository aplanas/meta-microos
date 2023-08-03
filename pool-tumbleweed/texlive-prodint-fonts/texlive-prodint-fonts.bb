SUMMARY = "Severed fonts for texlive-prodint"
DESCRIPTION = "The  separated fonts package for texlive-prodint"
LICENSE = "OFL-1.1"

PV = "2023.209.svn21893"

RPM_NAME = "texlive-prodint-fonts-2023.209.svn21893-53.1.noarch.rpm"
RPM_HASH = "b64e8d5135e26003bdfe091e52d77c93a7d890c04f9a94833b6dda22e7941941c18d85c8fd4fd6ebbda7fd7f5b1ef372fec3a742ac8639b9b74ce7f1a0661c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-prodint \
texlive-prodint-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
