SUMMARY = "YaST2 - Tajik Translations"
DESCRIPTION = "YaST2 - Tajik translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-tg-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "1852fdc6626e3ef9142e3d679c3c196050d783fb5f3769eb1e2b33fa3390912b560d358619c2ce8ec9d1ae51787443e6e45b72102c5daa51498f10f458603403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tg \
yast2-trans-tg"

RDEPENDS:${PN} += ""

inherit rpm
