SUMMARY = "YaST2 - Lithuanian Translations"
DESCRIPTION = "YaST2 - Translations for Lithuanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-lt-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "c0faee424883198cf1cf3f397e51d9229db12595702f787b6edee318cccf32978a87eccf62a594bbb5d5c4157708ecef22feb93bd1d1f9d309f622f6d2428b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lt \
yast2-trans-lt"

RDEPENDS:${PN} += ""

inherit rpm
