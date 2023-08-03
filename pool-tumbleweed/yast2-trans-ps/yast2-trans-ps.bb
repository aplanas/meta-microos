SUMMARY = "YaST2 - Pashto Translations"
DESCRIPTION = "YaST2 - Translations for Pashto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ps-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "b1ad3e45d9bdff565410e00688248a5078f5cc0adfe22ca2d53e36a03d74617b7f907118080a9bb32fa8cff05ffcc1f5703e11f10e84d188218a7cec0aa54239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ps \
yast2-trans-ps"

RDEPENDS:${PN} += ""

inherit rpm
