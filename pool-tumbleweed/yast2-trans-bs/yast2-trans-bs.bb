SUMMARY = "YaST2 - Bosnian Translations"
DESCRIPTION = "YaST2 - Translations for Bosnian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-bs-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "09bcce0feff72dbfcbd2de5100e57c63241666d8bd0f36f36e356a2c0964ac67a2e84cb3a933220496264699767368812b8f33b179e5d18c80d8ceb6c7e5475f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:bs) \
yast2-trans-bs"
RDEPENDS:${PN} += ""

inherit rpm
