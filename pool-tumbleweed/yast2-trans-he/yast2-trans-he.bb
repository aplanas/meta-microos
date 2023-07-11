SUMMARY = "YaST2 - Hebrew Translations"
DESCRIPTION = "YaST2 - Translations for Hebrew."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-he-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "8f484e69b8ee81e8c99a7f44688d8f592df7a43868b01af3fcebae0c544759fc47c0715a82cda2edb3234f297a904c7d34885f210072775a202df3a08ba9998c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-he \
yast2-trans-he"

RDEPENDS:${PN} += ""

inherit rpm
