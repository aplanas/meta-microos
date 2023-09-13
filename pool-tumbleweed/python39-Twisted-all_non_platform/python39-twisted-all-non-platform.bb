SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-all_non_platform-22.10.0-8.1.noarch.rpm"
RPM_HASH = "86a08ca7b0fc65788f2f85826b4f1e7e91e6b3c3efb4ea0f8555e367aff65c56fcb5ca4fe8a0da04e804baa7a445e33392065a7dfba704a9c0c659dbb5924027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-all-non-platform"

RDEPENDS:${PN} += "python39-PyHamcrest \
python39-Twisted-conch \
python39-Twisted-contextvars \
python39-Twisted-http2 \
python39-Twisted-serial \
python39-Twisted-tls"

inherit rpm
