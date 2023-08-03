SUMMARY = "YaST2 - Croatian Translations"
DESCRIPTION = "YaST2 - Croatian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-hr-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "3dbc3450fdc3c4fd2c2050b5143a73e56e82ecd76448b14241e2ec8a07bbfe906379f364e2a526f8ab9ae321d4183370f12b91e79dff4e19dd60b921800460ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hr \
yast2-trans-hr"

RDEPENDS:${PN} += ""

inherit rpm
