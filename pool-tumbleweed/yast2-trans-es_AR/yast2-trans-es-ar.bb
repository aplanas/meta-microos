SUMMARY = "YaST2 - Spanish (Argentina) Translations"
DESCRIPTION = "YaST2 - Spanish (Argentina) Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-es_AR-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "b7de67dc4b581768b3435e671ff84213416f4afc9e3b769821eafa107edb3d4f25c013994e4c51c272c03fec8202a4eefdd89c0620d8184109ab8b3827331697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es-AR \
yast2-trans-es-AR"

RDEPENDS:${PN} += ""

inherit rpm
