SUMMARY = "Severed fonts for texlive-gfsporson"
DESCRIPTION = "The  separated fonts package for texlive-gfsporson"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn18651"

RPM_NAME = "texlive-gfsporson-fonts-2023.201.1.01svn18651-52.1.noarch.rpm"
RPM_HASH = "ff13083b2021e730cf194f81fb0ccf226d50a9dbd04abcda29c1f81767f88828851cba1776885c64c9959849e86b0841635390e6f446e64f2d3e8254f15fd9a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-gfsporson-fonts \
font--lang=el \
font-gfsporson \
font-gfsporsonrg \
texlive-gfsporson-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
