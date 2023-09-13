SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-contextvars-22.10.0-8.1.noarch.rpm"
RPM_HASH = "d28bc15ad0b81ebf7e3cc365ad42956a7deabcf4a9930d54d20b1d83278b54bb7e536ac77a638fdfabe910d2917c1ac8d627946acbbd8ee56bf8e944415dd70c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-contextvars"

RDEPENDS:${PN} += "python39-Twisted"

inherit rpm
