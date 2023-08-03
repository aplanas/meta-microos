SUMMARY = "Severed fonts for texlive-belleek"
DESCRIPTION = "The  separated fonts package for texlive-belleek"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn66115"

RPM_NAME = "texlive-belleek-fonts-2023.209.svn66115-54.1.noarch.rpm"
RPM_HASH = "b894bb6beaba98aa9bffd420431d62bd6177087f063382ee77c9ee42d168de5d91d3d05544db78b570f5e1af5ee2b8734e4d24ad056cd6b341c04ae17a574828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-belleek-fonts \
font-blex \
font-blsy \
font-rblmi \
texlive-belleek-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
