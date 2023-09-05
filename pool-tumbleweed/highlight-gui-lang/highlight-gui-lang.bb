SUMMARY = "Translations for package highlight-gui"
DESCRIPTION = "Provides translations for the 'highlight-gui' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.8"

RPM_NAME = "highlight-gui-lang-4.8-1.1.noarch.rpm"
RPM_HASH = "a38ec4349205daaff4ed92a4f477b29a5c2917082987bc52949ad64df3866fa9fd05630e27bab75011d880caa9e4a8638fd1c3aab8f41846ff60008106fc74e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-gui-lang \
highlight-gui-lang-all"

RDEPENDS:${PN} += "highlight-gui"

inherit rpm
