SUMMARY = "YaST2 - Norwegian Bokmål Translations"
DESCRIPTION = "YaST2 - Translations for Norwegian Bokmål."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-nb-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "bf52c14c0c77679a049e43707d3f2d349c4d932341550171c560400b36d37733a9d0c841f540d18c5de7804478ea479ca9b21b9c6e2c414e9654443d604b6bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nb \
yast2-trans-nb"

RDEPENDS:${PN} += ""

inherit rpm
