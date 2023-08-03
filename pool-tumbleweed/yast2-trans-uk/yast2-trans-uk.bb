SUMMARY = "YaST2 - Ukrainian Translations"
DESCRIPTION = "YaST2 - Translations for Ukrainian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-uk-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "ea9e0d0a9dfdab49ff307f48a4d7deae23d4cb2859e5f1c67ff7a2d9cf1dbed178b72cfc87f9aeff08c50746d7ad512fc63f95e4d13a1791c3ba460048a5261f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-uk \
yast2-trans-uk"

RDEPENDS:${PN} += ""

inherit rpm
