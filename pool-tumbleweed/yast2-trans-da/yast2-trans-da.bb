SUMMARY = "YaST2 - Danish Translations"
DESCRIPTION = "YaST2 - Translations for Danish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-da-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "7b8ee7801ef7549d0f9e04d22e7add1767f268ef5d564e34f01ed836dcbd3b259edeef74f1a0f2d6eff6f022fa6dd98adeb376b3246c3da79a13bb97b5040cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-da \
yast2-trans-da"

RDEPENDS:${PN} += ""

inherit rpm
