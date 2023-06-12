SUMMARY = "YaST2 - Lithuanian Translations"
DESCRIPTION = "YaST2 - Translations for Lithuanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-lt-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "9c0c9e4c7a901c1e9a41a1037cef41d2809a915f697f1b20d739cfa8c15071237994d271e1fdf72adfc4fc2dda71fa749f270ed3ba324ce6146dc070023a3c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:lt) \
yast2-trans-lt"
RDEPENDS:${PN} += ""

inherit rpm
