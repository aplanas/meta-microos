SUMMARY = "Fonts from the Trajan column in Rome"
DESCRIPTION = "Provides fonts (both as Metafont source and in Adobe Type 1 \
format) based on the capitals carved on the Trajan column in \
Rome in 114 AD, together with macros to access the fonts. Many \
typographers think these rank first among the Roman's artistic \
legacy. The font is uppercase letters together with some \
punctuation and analphabetics; no lowercase or digits."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-trajan-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "83a06ea06d0e86a033cbc8835f7cdacef3d8f6cf23f8e973379d955fce9e7c7ea4c10f457793b77ad427d4c9981ca996d8703c03a57a36325204620658670ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t1trjn.fd \
tex-trajan.map \
tex-trajan.sty \
tex-trjnr10.tfm \
tex-trjnsl10.tfm \
texlive-trajan"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-trajan-fonts"

inherit rpm
