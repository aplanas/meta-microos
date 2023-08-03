SUMMARY = "Severed fonts for texlive-superiors"
DESCRIPTION = "The  separated fonts package for texlive-superiors"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn51909"

RPM_NAME = "texlive-superiors-fonts-2023.209.1.06svn51909-58.1.noarch.rpm"
RPM_HASH = "de5d5856ed5b8c273cc1d0fc3b63fb0c7389f5c16312283b53369901fd7e2e039d7d7db49c3bf284cae529b5c51258eb899e33cdd4d6d4ca54c2b3bbec1d5667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-libertinesups \
texlive-superiors-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
