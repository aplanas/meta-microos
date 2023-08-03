SUMMARY = "Severed fonts for texlive-rojud"
DESCRIPTION = "The  separated fonts package for texlive-rojud"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn56895"

RPM_NAME = "texlive-rojud-fonts-2023.209.1.2svn56895-54.1.noarch.rpm"
RPM_HASH = "b9dd0d990e6f169b79b7a9ea76afccaaa2c58b947deb379f97af15b78ded727c81875a0d2603b145656e9f589810c871c05d2e99c91c5f4eb00e6fc25f6068e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-rojud \
texlive-rojud-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
