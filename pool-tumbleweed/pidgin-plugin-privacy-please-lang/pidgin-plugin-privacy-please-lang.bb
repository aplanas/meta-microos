SUMMARY = "Translations for package pidgin-plugin-privacy-please"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-privacy-please' package."
LICENSE = "GPL-3.0+"

PV = "0.7.1"

RPM_NAME = "pidgin-plugin-privacy-please-lang-0.7.1-1.25.noarch.rpm"
RPM_HASH = "8a096164b1df3957ce029485c9fb3096160952139d133029b3c2e32f2791ee9a6b78006293cf1399a41cc25009a28287596eeb925af11a5799d068dc92a7e416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pidgin-plugin-privacy-please-de \
locale-pidgin-plugin-privacy-please-pl \
locale-pidgin-plugin-privacy-please-ru \
pidgin-plugin-privacy-please-lang \
pidgin-plugin-privacy-please-lang-all"

RDEPENDS:${PN} += "pidgin-plugin-privacy-please"

inherit rpm
