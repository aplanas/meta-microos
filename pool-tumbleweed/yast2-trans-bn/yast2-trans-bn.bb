SUMMARY = "YaST2 - Bengali Translations"
DESCRIPTION = "YaST2 - Translations for Bengali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-bn-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "75a5d6d13902b2749c38b2636625c5cd5e382798caece355e279fd8f705ee91c3d088c2f57d8662c93a89791310b93b6fda72f963739616f33b981217e8e076f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bn \
yast2-trans-bn"

RDEPENDS:${PN} += ""

inherit rpm
