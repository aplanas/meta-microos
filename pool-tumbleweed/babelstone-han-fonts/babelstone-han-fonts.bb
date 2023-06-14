SUMMARY = "BabelStone font for Han Script"
DESCRIPTION = "BabelStone Han is a dual-width Unicode Han font in Song/Ming style \
with G-source glyphs used in the People's Republic of China."
LICENSE = "Arphic-1999"

PV = "15.0.5"

RPM_NAME = "babelstone-han-fonts-15.0.5-1.2.noarch.rpm"
RPM_HASH = "f05387082568e600e52564a52d93ba88ae3bb70573ab8842b2335d2120e174b6ddca952713a1ef3f11e9bd0147a3e54a7c5a93d056deab929cd0200036ce8899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-han-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
