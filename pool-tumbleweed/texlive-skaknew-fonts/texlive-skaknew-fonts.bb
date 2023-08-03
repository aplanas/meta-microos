SUMMARY = "Severed fonts for texlive-skaknew"
DESCRIPTION = "The  separated fonts package for texlive-skaknew"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20031"

RPM_NAME = "texlive-skaknew-fonts-2023.209.svn20031-58.1.noarch.rpm"
RPM_HASH = "13eb236c40f06926d97d1ca8f1ec8c35df7ab540c262b819618597702a54c95718bdaa4d6826620c8c0169f51f72947f6e0f2a15b98c49d3fa73556f60f75edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-skaknew-fonts \
font-chessalphadiagram \
font-skaknew-diagram \
font-skaknew-diagramt \
font-skaknew-figurine \
font-skaknewfigurine \
texlive-skaknew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
