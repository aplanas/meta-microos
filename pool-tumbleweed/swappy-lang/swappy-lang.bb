SUMMARY = "Translations for package swappy"
DESCRIPTION = "Provides translations for the 'swappy' package."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "swappy-lang-1.5.1-1.4.noarch.rpm"
RPM_HASH = "f2782145b888186836f9d5c22e63d21f111ff5e351d5fc837d45ce88c887b5e47fd401a9f1a52ffb1a821e6ad3b23ecc34f9e9cdec55ba92a601fba454453daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-swappy-de \
locale-swappy-en \
locale-swappy-fr \
locale-swappy-pt-BR \
locale-swappy-tr \
swappy-lang \
swappy-lang-all"

RDEPENDS:${PN} += "swappy"

inherit rpm
