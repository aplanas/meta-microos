SUMMARY = "YaST2 - Serbian (Latin) Translations"
DESCRIPTION = "YaST2 - Translations for Serbian (Latin)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-sr-latin-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "e564437866b5592ce464c6b368a5ba294c03e07073204af1dc225bc8409dfada320121e6017bd431fbfca7cdbe3fdd8824bf950c344f3c52ccdb0ce2c974e316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr@latin \
yast2-trans-sr-latin"

RDEPENDS:${PN} += ""

inherit rpm
