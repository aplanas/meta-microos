SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-all_non_platform-22.10.0-6.1.noarch.rpm"
RPM_HASH = "eb9e55f74695faffcf561c69578e00eda3d1a23860db43675262e22674f78bb4a294ed7aa3658cec1ec21f0ad454bb2a8ac915c1a3de4817c327a4a94235e587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-all-non-platform"

RDEPENDS:${PN} += "python311-PyHamcrest \
python311-Twisted-conch \
python311-Twisted-contextvars \
python311-Twisted-http2 \
python311-Twisted-serial \
python311-Twisted-tls"

inherit rpm
