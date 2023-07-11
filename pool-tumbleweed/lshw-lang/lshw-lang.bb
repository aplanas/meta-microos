SUMMARY = "Translations for package lshw"
DESCRIPTION = "Provides translations for the 'lshw' package."
LICENSE = "GPL-2.0-only"

PV = "B.02.19.2+git.20230320"

RPM_NAME = "lshw-lang-B.02.19.2+git.20230320-1.2.noarch.rpm"
RPM_HASH = "fdb533bada5bdbfcc0928f35bd39e3b43b7de0ac9be81373eee0037741acf341e7a0d4c4712cdd4d2d2bd694e7da157b59b2830fa54df7064adefb14efcc0336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lshw-ca \
locale-lshw-es \
locale-lshw-fr \
lshw-lang \
lshw-lang-all"

RDEPENDS:${PN} += "lshw"

inherit rpm
