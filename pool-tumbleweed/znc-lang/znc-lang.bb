SUMMARY = "Translations for package znc"
DESCRIPTION = "Provides translations for the 'znc' package."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-lang-1.8.2-3.7.noarch.rpm"
RPM_HASH = "f7e9d9b3b2416056d18178ba3b35f0d1210e3c1b81e14ef6ee53965b22350f96a913d49c0b499975bd2a447b5dbc88edddfa2e9fcfc0ccc560abc88bf4c4c071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(znc:de_DE) \
locale(znc:el_GR) \
locale(znc:es_ES) \
locale(znc:fr_FR) \
locale(znc:it_IT) \
locale(znc:pl_PL) \
locale(znc:pt_BR) \
locale(znc:ru_RU) \
znc-lang \
znc-lang-all"
RDEPENDS:${PN} += "znc"

inherit rpm
