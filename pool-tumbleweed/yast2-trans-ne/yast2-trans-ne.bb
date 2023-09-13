SUMMARY = "YaST2 - Nepali Translations"
DESCRIPTION = "YaST2 - Translations for Nepali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ne-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "08d07a745d9af36a5ba9afa037140c750eb40cb0230da158e80eae293c2060b414b7278b1a897a71948798a915e125afbee7d9678022dc2456803c75921691f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ne \
yast2-trans-ne"

RDEPENDS:${PN} += ""

inherit rpm
