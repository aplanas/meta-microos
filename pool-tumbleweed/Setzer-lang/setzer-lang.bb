SUMMARY = "Translations for package Setzer"
DESCRIPTION = "Provides translations for the 'Setzer' package."
LICENSE = "GPL-3.0-or-later"

PV = "56"

RPM_NAME = "Setzer-lang-56-1.1.noarch.rpm"
RPM_HASH = "41a182cb76dc762a2ca5c244f25a5cf7f7913f2143df2a848db251743434077c78b09cfcd1d8613d8d89cdfcbaa970ec3f9aa58b69262879da393a28bf76dfeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Setzer-lang \
Setzer-lang-all \
locale-Setzer-de \
locale-Setzer-it"

RDEPENDS:${PN} += "Setzer"

inherit rpm
