SUMMARY = "Non-variable M PLUS 1 Sans Serif font"
DESCRIPTION = "M PLUS 1 is a Sans Serif font with 9 weights from Thin to Black, \
supporting GF Latin Plus glyph set with 5,700+ Kanjis for Japanese."
LICENSE = "OFL-1.1"

PV = "20230116"

RPM_NAME = "mplus1-fonts-20230116-1.1.noarch.rpm"
RPM_HASH = "772e5e559a50564005440eae3aba4d30a810f7ce61cc4c5a6a7549a34048e0c4bd8dc53039f5e499b2c63f9161fd7c831a535e04ca00c5274690a46da0696198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus1-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
