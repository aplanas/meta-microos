SUMMARY = "YaST2 - Spanish (Argentina) Translations"
DESCRIPTION = "YaST2 - Spanish (Argentina) Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-es_AR-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "0c45911bfff381de704ea657c0a3a61a8912452f439fef4d2ee519d2f3a096ffb6ad1383c152a28ffde5d0848b895133f80420064310e9c814db0b5603be4996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es-AR \
yast2-trans-es-AR"

RDEPENDS:${PN} += ""

inherit rpm
