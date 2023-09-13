SUMMARY = "YaST2 - French Translations"
DESCRIPTION = "YaST2 - Translations for French."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-fr-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "813729bea3139aa573f56582130bee1cd6feda0723f05230a399a1261b7d86c12f04650211291419cc527eb5e1e2c06b1e01caf5aa05b793172ffde3daa4b1b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fr \
yast2-trans-fr"

RDEPENDS:${PN} += ""

inherit rpm
