SUMMARY = "YaST2 - Romanian Translations"
DESCRIPTION = "YaST2 - Translations for Romanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ro-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "b7f0ea330af725526df8a120704b4421c6e34c03600cd89fa95d9024555723ce8396fd43fdd47b5bf943b9844b7b3c1d6fa3800358e737ed74ac32084b9ca6fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ro \
yast2-trans-ro"

RDEPENDS:${PN} += ""

inherit rpm
