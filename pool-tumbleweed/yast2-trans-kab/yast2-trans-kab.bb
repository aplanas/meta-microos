SUMMARY = "YaST2 - Kabyle Translations"
DESCRIPTION = "YaST2 - Translations for Kabyle."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-kab-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "22796a1f374f5f8a098f05727ddb4b66c6706b719c495ab0f64bf6b0a0e0a469ad46013a901a2e43073e95f5d13f1ef6e805ddd1e101922a6ced9e19d1135ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-kab \
yast2-trans-kab"

RDEPENDS:${PN} += ""

inherit rpm
