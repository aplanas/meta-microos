SUMMARY = "Severed fonts for texlive-gfscomplutum"
DESCRIPTION = "The  separated fonts package for texlive-gfscomplutum"
LICENSE = "OFL-1.1"

PV = "2023.209.1.0svn19469"

RPM_NAME = "texlive-gfscomplutum-fonts-2023.209.1.0svn19469-53.1.noarch.rpm"
RPM_HASH = "4c7649ac8b19a93efec414c3e161d8245f8557f01f949d79e016354c50d85d23c938b6f1878100ecebfb1a60d4a6cac374edb909c98087f33263fab72f88362a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-gfscomplutum-fonts \
font--lang=el \
font-gfscomplutum \
texlive-gfscomplutum-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
