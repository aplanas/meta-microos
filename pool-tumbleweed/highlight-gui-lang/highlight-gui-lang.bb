SUMMARY = "Translations for package highlight-gui"
DESCRIPTION = "Provides translations for the 'highlight-gui' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.6"

RPM_NAME = "highlight-gui-lang-4.6-1.1.noarch.rpm"
RPM_HASH = "47216857716ec5e0a7cfed834ab4df7228431f712c902f89abe035f8e2f6283f85ad88eed6a72ca4b46a8d0196daff7c8fd3800477ed237ae72ffe604a7bd2dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-gui-lang \
highlight-gui-lang-all"

RDEPENDS:${PN} += "highlight-gui"

inherit rpm
