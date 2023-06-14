SUMMARY = "Variable M PLUS 2 Sans Serif font"
DESCRIPTION = "M PLUS 2 is a Sans Serif variable font, supporting GF Latin Plus \
glyph set with 5,700+ Kanjis for Japanese."
LICENSE = "OFL-1.1"

PV = "20230116"

RPM_NAME = "mplus2-variable-fonts-20230116-1.1.noarch.rpm"
RPM_HASH = "d870c11c949761d5eb5d3be7c4c9f30ee3968beaa2167f60136bc297cda2048147cf9142ac563b607bee375450d582289119b35951757fa5b99b8bb09194e205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus2-variable-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
