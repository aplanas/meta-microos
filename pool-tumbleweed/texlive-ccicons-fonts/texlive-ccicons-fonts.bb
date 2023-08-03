SUMMARY = "Severed fonts for texlive-ccicons"
DESCRIPTION = "The  separated fonts package for texlive-ccicons"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn54512"

RPM_NAME = "texlive-ccicons-fonts-2023.209.1.6svn54512-53.1.noarch.rpm"
RPM_HASH = "0302983a781990e2f58d1831004818cd18ba2acafd8880706a11840a99c2d33941fb539c18932d12b2311899340ebcf8d61a05f174f53ecd0c4f8bddb2461172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-ccicons-fonts \
font-ccicons \
texlive-ccicons-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
