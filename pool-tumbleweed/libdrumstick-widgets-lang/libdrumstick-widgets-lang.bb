SUMMARY = "Translations for package libdrumstick-widgets"
DESCRIPTION = "Provides translations for the 'libdrumstick-widgets' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-widgets-lang-2.7.2-1.4.noarch.rpm"
RPM_HASH = "74dc11109dafbf2e69ba469a66dbc413879a31c6d3f8f5369285a8c12db3df48d2bc6131904f011f098d991104457fb15d6fd99f20c64f7c03a543b42f78c611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdrumstick-widgets-lang \
libdrumstick-widgets-lang-all"

RDEPENDS:${PN} += "libdrumstick-widgets"

inherit rpm
