SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-contextvars-22.10.0-8.1.noarch.rpm"
RPM_HASH = "bb9d5766871f7aefe03dbd78dd0637a55a26197a60127043059be2eaddf8b93484c03a5a938e229673319a2e9be44c9317dbd44229b6f6e9116e71762706170c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-contextvars"

RDEPENDS:${PN} += "python310-Twisted"

inherit rpm
