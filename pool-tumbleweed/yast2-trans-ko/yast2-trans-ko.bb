SUMMARY = "YaST2 - Korean Translations"
DESCRIPTION = "YaST2 - Translations for Korean."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ko-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "7ff641f32f1a670cd3fa9ac5c620e82a0aa74ef4738260d94d16318efe84c22274245ec81f9c2e37b9b40110e6c65aa8e949e755186635bff36ac935794f4d5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ko \
yast2-trans-ko"

RDEPENDS:${PN} += ""

inherit rpm
