SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-http2-22.10.0-7.1.noarch.rpm"
RPM_HASH = "c687e2b5af4386ecc7a654dd6cde7017f50f2c63a850e9a3099ad6f9a86300252c8e151c0a1e06cd7c3cfa0f20a3d2b6fffa2a8cc7b80fa58b079a7e7f64f86a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-http2"

RDEPENDS:${PN} += "python310-Twisted \
python310-h2 \
python310-priority"

inherit rpm
