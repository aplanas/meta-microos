SUMMARY = "YaST2 - Afrikaans Translations"
DESCRIPTION = "YaST2 - Translations for Afrikaans."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-af-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "bf274829810c888a7aab401e3cd68a7f24aaaf4cba250a67fbf4ac8202b699cc8260ce07f02747e001b51e41e2cc85ad11fe692d373262c251522535fdc71594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-af \
yast2-trans-af"

RDEPENDS:${PN} += ""

inherit rpm
