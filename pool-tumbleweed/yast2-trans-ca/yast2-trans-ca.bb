SUMMARY = "YaST2 - Catalan Translations"
DESCRIPTION = "YaST2 - Catalan translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ca-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "3917e876293ff084d340bd9cf5655454823ad9589698a7597359b349113d2097b83fd0c8cbfe26e4b2ceeb02241afd1a9e0176665f3c7d7e4dc3ffb1a6ff0703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ca) \
yast2-trans-ca"
RDEPENDS:${PN} += ""

inherit rpm
