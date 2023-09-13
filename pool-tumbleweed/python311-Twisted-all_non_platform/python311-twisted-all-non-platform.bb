SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-all_non_platform-22.10.0-8.1.noarch.rpm"
RPM_HASH = "5bbfcfc58ad995b7af66e2e1170b5159e59d82918865e2c1e31a967dcdd3112483fafdcf80d51df88f82c15fdffdb59d81c057f74e722eb2d46f24df3029c80d"
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
