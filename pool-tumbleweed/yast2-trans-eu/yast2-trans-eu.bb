SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Translations for Esperanto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-eu-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "6237a40faaba40a6f8a6f67deb03dd8f85e79426dcdab5a8fc037d2f795904b8686598f3d9468c0c20e43bd9b9745d4f63832796a7b654cc24c6990261a79e6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eu \
yast2-trans-eu"

RDEPENDS:${PN} += ""

inherit rpm
