SUMMARY = "Severed fonts for texlive-bguq"
DESCRIPTION = "The  separated fonts package for texlive-bguq"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn27401"

RPM_NAME = "texlive-bguq-fonts-2023.209.0.0.4svn27401-54.1.noarch.rpm"
RPM_HASH = "9354e90f2f33d9698f7330f56ea14708ec307c428c92dbfaaaa394c1cf84e8ca69282e75155bbe5dff44d0a4cc8f91b482eca0a4ebb5df7cfe07aea21d5354d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-bguq10t04 \
font-bguq10t05 \
font-bguq10t06 \
font-bguq10t07 \
font-bguq10t08 \
font-bguq10t09 \
font-bguq10t10 \
font-bguq10t11 \
font-bguq10t12 \
texlive-bguq-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
