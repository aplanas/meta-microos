SUMMARY = "Severed fonts for texlive-ascmac"
DESCRIPTION = "The  separated fonts package for texlive-ascmac"
LICENSE = "BSD-3-Clause"

PV = "2023.209.2.1svn53411"

RPM_NAME = "texlive-ascmac-fonts-2023.209.2.1svn53411-54.1.noarch.rpm"
RPM_HASH = "ac2a1f399c22d9c552fbc0defbb6d85f780e7db4a25b495ffddeb67d0315a1c225b351351bf9d97513b2fbd019bdc8ed9fa4794aa23c6027768a673d5afa0622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-tex\040ascgrp \
font-tex\040ascii10 \
font-tex\040ascii36 \
texlive-ascmac-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
