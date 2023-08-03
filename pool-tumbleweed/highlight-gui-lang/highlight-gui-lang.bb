SUMMARY = "Translations for package highlight-gui"
DESCRIPTION = "Provides translations for the 'highlight-gui' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.7"

RPM_NAME = "highlight-gui-lang-4.7-1.1.noarch.rpm"
RPM_HASH = "87a1b7f40f5b24ded29c297f411197b6b00ac32ec831615d85844b67e35053f5561084f6cd521219530bdba53f148750009e131b045587aa74a83562db29adce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-gui-lang \
highlight-gui-lang-all"

RDEPENDS:${PN} += "highlight-gui"

inherit rpm
