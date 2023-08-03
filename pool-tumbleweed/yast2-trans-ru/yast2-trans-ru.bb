SUMMARY = "YaST2 - Russian Translations"
DESCRIPTION = "YaST2 - Translations for Russian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ru-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "488888cddadbb57d7e4d858963a1601cf66d98e94f55bbb1cc647b6dec0c2146f9441684089a80337a25b5e088861e9c60cbb6d3c80f3bc23c2bf694f3ccc448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ru \
yast2-trans-ru"

RDEPENDS:${PN} += ""

inherit rpm
