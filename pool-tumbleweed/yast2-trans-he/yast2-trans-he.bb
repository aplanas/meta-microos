SUMMARY = "YaST2 - Hebrew Translations"
DESCRIPTION = "YaST2 - Translations for Hebrew."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-he-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "3fe503ee0f37d85532456c5ebbbe1410162167db9a563aa641771af9347333296730c41d1ba54032d3aa84c30bc891e6ba77d19fc5e2471e51f2d1230ceb1b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-he \
yast2-trans-he"

RDEPENDS:${PN} += ""

inherit rpm
