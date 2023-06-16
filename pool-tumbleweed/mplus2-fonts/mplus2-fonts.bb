SUMMARY = "Non-variable M PLUS 2 Sans Serif font"
DESCRIPTION = "M PLUS 2 is a Sans Serif font with 9 weights from Thin to Black, \
supporting GF Latin Plus glyph set with 5,700+ Kanjis for Japanese."
LICENSE = "OFL-1.1"

PV = "20230116"

RPM_NAME = "mplus2-fonts-20230116-1.1.noarch.rpm"
RPM_HASH = "f681c3a309fa3fe3b0b3afeae359b999200fad2bdfaca93a7c1c589d02f9620eba6799b6069d1b8d7278c360c2671f0478a21d421acf6f462e6e19824d5a60bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus2-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
