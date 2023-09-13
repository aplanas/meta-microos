SUMMARY = "YaST2 - Danish Translations"
DESCRIPTION = "YaST2 - Translations for Danish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-da-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "e7ad73e4c4d971ab0f25fcf5d11ff2a2d0ab8d6481629da6339f8ac62e225891bbb190f5dd1804488f208d6227d8d6bbae7d47f7fcd10343722f42668f729929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-da \
yast2-trans-da"

RDEPENDS:${PN} += ""

inherit rpm
