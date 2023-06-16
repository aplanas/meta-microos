SUMMARY = "Severed fonts for texlive-fonetika"
DESCRIPTION = "The  separated fonts package for texlive-fonetika"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21326"

RPM_NAME = "texlive-fonetika-fonts-2023.201.svn21326-52.1.noarch.rpm"
RPM_HASH = "983c475bc49156555fb53b3b059cae31b59ac2f2c014461062467726966f7d57ea063bf8b5b21cb48cf6bc184bbbcef9bf66b665ae841fc65e682aac939b9333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fonetika-fonts \
font-fonetikadaniaiwonae \
font-fonetikadaniapallae \
texlive-fonetika-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
