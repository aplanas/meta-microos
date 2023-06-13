SUMMARY = "Translations for package deepin-calculator"
DESCRIPTION = "Provides translations for the 'deepin-calculator' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.7.21"

RPM_NAME = "deepin-calculator-lang-5.7.21-1.3.noarch.rpm"
RPM_HASH = "23578ebb402b62fd82ff70aa926730360c2bb794ec363b09aa36c2330d7670a496be86bc4cd4044c3fa840d77cc969a1a1e2cbe3a0dda498920b8f53cc2d3ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-calculator-lang \
deepin-calculator-lang-all"

RDEPENDS:${PN} += "deepin-calculator"

inherit rpm
