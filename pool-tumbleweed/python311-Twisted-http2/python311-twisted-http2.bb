SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-http2-22.10.0-7.1.noarch.rpm"
RPM_HASH = "8f62c121f0b5ac5cdcea05e964bf15b7369b151dd8ceb046d488fc2b7cc297b555ff2a75ce8ff1d82cce8b097ba8f28501650d54d39ccb82dfd5144f9e500b6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-http2 \
python311-Twisted-http2"

RDEPENDS:${PN} += "python311-Twisted \
python311-h2 \
python311-priority"

inherit rpm
