SUMMARY = "Severed fonts for texlive-wasy-type1"
DESCRIPTION = "The  separated fonts package for texlive-wasy-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.001.002svn53534"

RPM_NAME = "texlive-wasy-type1-fonts-2023.209.001.002svn53534-54.1.noarch.rpm"
RPM_HASH = "60ce82f204e7d7e13b36b3285e41756def9d2229bea6ba260857a125ddacdd66a569349a647a9119a6f2bff6a954e0e79abd23f5a03e68d7ea740b209faabf9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-wasy \
font-wasysl10 \
texlive-wasy-type1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
