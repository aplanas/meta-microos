SUMMARY = "YaST2 - French Translations"
DESCRIPTION = "YaST2 - Translations for French."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-fr-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "4159863d34629b3f5ebb32da1624fae0a670049e218b4366c80fe94e2776833b4e340547e37977db235878594f28d7ffd584fed3791633ac6776cfb8f3c76819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fr \
yast2-trans-fr"

RDEPENDS:${PN} += ""

inherit rpm
