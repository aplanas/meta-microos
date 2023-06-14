SUMMARY = "Severed fonts for texlive-prodint"
DESCRIPTION = "The  separated fonts package for texlive-prodint"
LICENSE = "OFL-1.1"

PV = "2023.201.svn21893"

RPM_NAME = "texlive-prodint-fonts-2023.201.svn21893-52.1.noarch.rpm"
RPM_HASH = "9d58ccd2bcf2433e99d356dbc5b9e069a0f6569ac9cd03371d44bab1665b2be600f341d3346de9184054495ecb83ae5661afd4fa713a68be2d6734c28952c8e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-prodint \
texlive-prodint-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
