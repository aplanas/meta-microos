SUMMARY = "Severed fonts for texlive-lilyglyphs"
DESCRIPTION = "The  separated fonts package for texlive-lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.4svn56473"

RPM_NAME = "texlive-lilyglyphs-fonts-2023.209.0.0.2.4svn56473-55.1.noarch.rpm"
RPM_HASH = "d2395abda5d5b78a19b0492fd4d373fcd4f9fd718eaea14dff29b6437a1dea03b6ba63b8b2e795508c70e842da535fa17839707ff90ec285a749921941c68efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-emmentaler-11 \
font-emmentaler-13 \
font-emmentaler-14 \
font-emmentaler-16 \
font-emmentaler-18 \
font-emmentaler-20 \
font-emmentaler-23 \
font-emmentaler-26 \
font-emmentaler-brace \
texlive-lilyglyphs-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
