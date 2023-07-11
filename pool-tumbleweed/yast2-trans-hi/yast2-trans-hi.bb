SUMMARY = "YaST2 - Hindi Translations"
DESCRIPTION = "YaST2 - Translations for Hindi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-hi-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "6123835575064b7ab913bb02e9fe6c0bdb7319eb8501b0a6a1278bb21f4a1fbf77e7b58f31f539d666299e4c34168ba2fa1098b67e63d6a162632cd0d8b08de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hi \
yast2-trans-hi"

RDEPENDS:${PN} += ""

inherit rpm
