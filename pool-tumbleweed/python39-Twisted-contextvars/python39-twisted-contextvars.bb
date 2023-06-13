SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-contextvars-22.10.0-6.1.noarch.rpm"
RPM_HASH = "1d525905952570d97c25519c3f5d212c411681e95a44171a6f1cf35363f5b74b152dc313778c6ff26bb6e390c8efbe4c2e2df6f022fa916c9a961feb44ec167c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-contextvars"

RDEPENDS:${PN} += "python39-Twisted"

inherit rpm
