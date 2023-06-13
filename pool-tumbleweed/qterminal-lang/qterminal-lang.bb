SUMMARY = "Translations for package qterminal"
DESCRIPTION = "Provides translations for the 'qterminal' package."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "qterminal-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "7c4d7a57d0c4213ed6d66a90b3d37501a8c57225ba45bb5cedbbd279a3010b3fa8ac085945762178fcd87d630427cad8a6312c92c1c1bf6e29dd4416363fc112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qterminal-lang \
qterminal-lang-all"

RDEPENDS:${PN} += "qterminal"

inherit rpm
