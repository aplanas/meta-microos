SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-http2-22.10.0-7.1.noarch.rpm"
RPM_HASH = "e0185e24bed43bd488ea323509d48a9a726ed201f25436b7e2b1e15fa06d37660d38b0ac39c43327fb49c8d692e36f7a787d6f3237e81816a004634c6250aadc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-http2"

RDEPENDS:${PN} += "python39-Twisted \
python39-h2 \
python39-priority"

inherit rpm
