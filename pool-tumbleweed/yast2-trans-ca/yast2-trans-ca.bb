SUMMARY = "YaST2 - Catalan Translations"
DESCRIPTION = "YaST2 - Catalan translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ca-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "db3b8b56640c5cbd8f3e3971cf6e5c4d4ab3c8fcbc5954f4df41f4b652aa3f484760b710b767f47b9dc0c000218b159ea78b5519c2e11fb3fe779c3cd6807379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ca \
yast2-trans-ca"

RDEPENDS:${PN} += ""

inherit rpm
