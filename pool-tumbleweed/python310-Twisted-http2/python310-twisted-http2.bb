SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-http2-22.10.0-6.1.noarch.rpm"
RPM_HASH = "231d397fa965a799717d784abad6941b17f92303c90df982fe1d27d410a644521cac6e38488aa63ac76f0dd70386a80fd2cebcc8c1f9cd781df3ee9ca8006da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-http2 \
python310-Twisted-http2"

RDEPENDS:${PN} += "python310-Twisted \
python310-h2 \
python310-priority"

inherit rpm
