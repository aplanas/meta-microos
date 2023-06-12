SUMMARY = "Severed fonts for texlive-belleek"
DESCRIPTION = "The  separated fonts package for texlive-belleek"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn66115"

RPM_NAME = "texlive-belleek-fonts-2023.201.svn66115-53.1.noarch.rpm"
RPM_HASH = "23abc9de71ec45eaab4995670af88a5656bcc13c9468b4e4a0444424e867f9251102e64e393d53a59170e2afc1c2f5918020e7afe1e7e1cd8a4f464562e9c386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-belleek-fonts) \
font(blex) \
font(blsy) \
font(rblmi) \
texlive-belleek-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
