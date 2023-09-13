SUMMARY = "YaST2 - Arabic Translations"
DESCRIPTION = "YaST2 - Translations for Arabic."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ar-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "0c1c770ba40a52052e8dd10de25a187b6ad342c613f856c3c9c1958bb4fb3a487f730520e0aed646b3ba85e8a093b29d7760f54b3374d9f52853367a17b168b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ar \
yast2-trans-ar"

RDEPENDS:${PN} += ""

inherit rpm
