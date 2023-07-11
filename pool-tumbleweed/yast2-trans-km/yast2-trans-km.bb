SUMMARY = "YaST2 - Khmer Translations"
DESCRIPTION = "YaST2 - Translations for Khmer."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-km-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "27063c85ceb3e5205027720182ffe05d80d09b1a64db8266fa997098bdf1060dd7e5f1fa1fa1c224a09459713d48d6b3ac8d002e74d8b280f920ee009f904e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-km \
yast2-trans-km"

RDEPENDS:${PN} += ""

inherit rpm
