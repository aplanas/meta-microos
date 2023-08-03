SUMMARY = "Severed fonts for texlive-phaistos"
DESCRIPTION = "The  separated fonts package for texlive-phaistos"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn18651"

RPM_NAME = "texlive-phaistos-fonts-2023.209.1.0svn18651-52.1.noarch.rpm"
RPM_HASH = "34be4263f5acce6b7c3263e930cc4c78aa7d95c921d190237a02adc7a098c10e9fc3be48fd75cee59c7400c81644419c14caa687361579864c6519e31db80028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-phaistos-fonts \
font-phaistos \
texlive-phaistos-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
