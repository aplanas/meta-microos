SUMMARY = "YaST2 - Galician Translations"
DESCRIPTION = "YaST2 - Galician translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-gl-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "f6a3dc9e304dd94d1684d5b29c7ce17f3a654e835476fe78e80eafd8d1c4de25927d0ab37f604035eeefafbb17e3a7ad233b7252aad92bd6049917d2def59756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gl \
yast2-trans-gl"

RDEPENDS:${PN} += ""

inherit rpm
