SUMMARY = "YaST2 - Spanish (Argentina) Translations"
DESCRIPTION = "YaST2 - Spanish (Argentina) Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-es_AR-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "40f52b2ff1c0b0ec0ebd66c508545c8b03a92642ba6722d7bf02be6c8a7861209444636065d4c258a02e7d482eb86235dc3667a8616848133820ad8894e74dc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es-AR \
yast2-trans-es-AR"

RDEPENDS:${PN} += ""

inherit rpm
