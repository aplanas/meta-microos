SUMMARY = "Severed fonts for texlive-yinit-otf"
DESCRIPTION = "The  separated fonts package for texlive-yinit-otf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-fonts-2023.201.1.0svn40207-52.1.noarch.rpm"
RPM_HASH = "a0c87bba40e34fae79778bb3ed4de7e0824d7b5d4f1c44c7b2bc113ae595a0ab981bc8a705768220a5660d1398795a3fcf4129dc83b90176fda37089aa664151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-yinit \
texlive-yinit-otf-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
