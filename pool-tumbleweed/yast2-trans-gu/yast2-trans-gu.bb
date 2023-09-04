SUMMARY = "YaST2 - Gujarati Translations"
DESCRIPTION = "YaST2 - Translations for Gujarati."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-gu-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "0bd0f1745500be022d30bae7f13c69845a582a816603418aafd14ba115245ea961e7080ea7c0d70ba39d42c706c87595788a25f6cdd3c72eb65d2bf386997c29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gu \
yast2-trans-gu"

RDEPENDS:${PN} += ""

inherit rpm
