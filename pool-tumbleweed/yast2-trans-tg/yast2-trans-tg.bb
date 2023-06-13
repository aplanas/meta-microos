SUMMARY = "YaST2 - Tajik Translations"
DESCRIPTION = "YaST2 - Tajik translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-tg-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "ca5e61b7db25d5f3886a77515d34e1f1be7506f72db4bf0d1902d09ef22a42fd8acb3aad8fe5571dd0ea3729d57f248f520f3d1bec34234d3342b8882f1ed913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:tg) \
yast2-trans-tg"

RDEPENDS:${PN} += ""

inherit rpm
