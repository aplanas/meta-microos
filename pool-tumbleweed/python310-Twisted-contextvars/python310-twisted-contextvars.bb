SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-contextvars-22.10.0-6.1.noarch.rpm"
RPM_HASH = "68d66ac750af1c790e80fa0d712a6b1936e88967d9e882b110c4613fe6c86835f549306783a2563895751c82dbd0b0003aabb9f8398c5f1bbc4fc120937d7d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-contextvars \
python310-Twisted-contextvars"

RDEPENDS:${PN} += "python310-Twisted"

inherit rpm
