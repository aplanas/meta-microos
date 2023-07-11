SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-all_non_platform-22.10.0-7.1.noarch.rpm"
RPM_HASH = "64aaf0a4be46530fb02d2230b41a4701474039a235543e1410c300b898aa61fb38f136a6757d4f04dbba1678af503140209944189d0d7b34cece9baccafe1321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-all-non-platform \
python311-Twisted-all-non-platform"

RDEPENDS:${PN} += "python311-PyHamcrest \
python311-Twisted-conch \
python311-Twisted-contextvars \
python311-Twisted-http2 \
python311-Twisted-serial \
python311-Twisted-tls"

inherit rpm
