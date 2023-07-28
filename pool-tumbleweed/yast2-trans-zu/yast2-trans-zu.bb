SUMMARY = "YaST2 - Zulu Translations"
DESCRIPTION = "YaST2 - Translations for Zulu."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-zu-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "534e2a5b4403332488d8bfdd55b7a09940838eff9c52cd3c082886fbfddc01f23487218ce2b32e87a5dc43b2e9c5f8ada1ce3fb31303c8c9e544258f59477cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zu \
yast2-trans-zu"

RDEPENDS:${PN} += ""

inherit rpm
