SUMMARY = "Severed fonts for texlive-typicons"
DESCRIPTION = "The  separated fonts package for texlive-typicons"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.7svn37623"

RPM_NAME = "texlive-typicons-fonts-2023.209.2.0.7svn37623-53.1.noarch.rpm"
RPM_HASH = "34715d5387212812571b63cf09884b401d60935483f30d354b836a2b6c4b6904924153022bf485e010223328ec2adbfc6fea85a328d303d9539fa7113a3ac485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-typicons \
texlive-typicons-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
