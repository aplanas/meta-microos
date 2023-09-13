SUMMARY = "YaST2 - Afrikaans Translations"
DESCRIPTION = "YaST2 - Translations for Afrikaans."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-af-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "2b1a84eecfccacaaf898042b7ad508f522035265038792b999bc3990b1db2ba3bd4e671b37b1ec1f55298e5e2b4dd1f6cc2b1318f38bad45b8ed702c96d147e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-af \
yast2-trans-af"

RDEPENDS:${PN} += ""

inherit rpm
