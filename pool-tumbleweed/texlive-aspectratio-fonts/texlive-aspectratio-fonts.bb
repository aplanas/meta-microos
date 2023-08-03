SUMMARY = "Severed fonts for texlive-aspectratio"
DESCRIPTION = "The  separated fonts package for texlive-aspectratio"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn25243"

RPM_NAME = "texlive-aspectratio-fonts-2023.209.2.0svn25243-54.1.noarch.rpm"
RPM_HASH = "8b9b7d19fd41eba9954042c7af43f499d092a1fb0126ee9650002deab3bee4513cdbd317f7e520a3f3de43c889a9d0a38901f423db7549c69ca3d38a8019de30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-amar \
font-ar10 \
font-ar12 \
font-ar5 \
font-ar6 \
font-ar7 \
font-ar8 \
font-ar9 \
font-arb10 \
font-arb12 \
font-arb5 \
font-arb6 \
font-arb7 \
font-arb8 \
font-arb9 \
font-arssbi10 \
font-arssi10 \
font-artti10 \
texlive-aspectratio-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
