SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-http2-22.10.0-8.1.noarch.rpm"
RPM_HASH = "1e39d0805be0b025ed363bc55fc66da47ce7f0e915ebde95ea1a7754dc438a344b5d6ae7b3e8139bd3f5c4fe3afc1f48d2e330696cf38f8749687d085fcea74e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-http2"

RDEPENDS:${PN} += "python310-Twisted \
python310-h2 \
python310-priority"

inherit rpm
