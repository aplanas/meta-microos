SUMMARY = "Severed fonts for texlive-fonetika"
DESCRIPTION = "The  separated fonts package for texlive-fonetika"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21326"

RPM_NAME = "texlive-fonetika-fonts-2023.209.svn21326-53.1.noarch.rpm"
RPM_HASH = "a8a0cde7c2753df9c60dd517c0b7c11bd1c768e8ee84800c16e3477b1dd375d0ee7f85e4557c2f6ac93bb0b31899353d5d5a7d20f1944d0cd9d75ceac91db0e1"
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
