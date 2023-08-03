SUMMARY = "YaST2 - Khmer Translations"
DESCRIPTION = "YaST2 - Translations for Khmer."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-km-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "438cdcebe170ccb13ea9eda068f761c705cf843494c1cd28e8161382cc64ba88737ada4ff91452a30c55875565fa43ae1c8b289d984e599f4ec8a9bf7430e251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-km \
yast2-trans-km"

RDEPENDS:${PN} += ""

inherit rpm
