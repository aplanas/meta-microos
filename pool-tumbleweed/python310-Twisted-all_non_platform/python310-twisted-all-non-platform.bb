SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-all_non_platform-22.10.0-7.1.noarch.rpm"
RPM_HASH = "9d38be39d84c8f99fd3c876ef400523b01c6b4831eeec81e169bf6effbd7090f1fceea607a1a5dac19faa41412cc809e65ea8216d8c8847a9ca0ce4633b7a386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-all-non-platform"

RDEPENDS:${PN} += "python310-PyHamcrest \
python310-Twisted-conch \
python310-Twisted-contextvars \
python310-Twisted-http2 \
python310-Twisted-serial \
python310-Twisted-tls"

inherit rpm
