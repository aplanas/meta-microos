SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-contextvars-22.10.0-8.1.noarch.rpm"
RPM_HASH = "459c84439b61127b60fff1eba0878812614ba43f0be5757ab5f39d3050d0a17bf0d8253d0eeffa82df4ccf9bc3773fa9c2c6e6876b96c0b50415ce55e05e9d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-contextvars \
python311-Twisted-contextvars"

RDEPENDS:${PN} += "python311-Twisted"

inherit rpm
