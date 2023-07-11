SUMMARY = "YaST2 - Hungarian Translations"
DESCRIPTION = "YaST2 - Hungarian translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-hu-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "6fa7420086cd971f6e466a33ae6e3642424249918b703f8f19d7db588c90b108bef31a5fcc94c4867b406787be465dc27ea920d8d98a8edda839cf818471334a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hu \
yast2-trans-hu"

RDEPENDS:${PN} += ""

inherit rpm
