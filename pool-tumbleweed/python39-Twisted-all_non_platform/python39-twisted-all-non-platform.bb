SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-all_non_platform-22.10.0-6.1.noarch.rpm"
RPM_HASH = "fa87ea1218c8b3c57c8b1ba916afb04340860ff146f356bed81783b849876cc3139c82e23f39317706a9d51b762a26157b115809016dd896d847f69932fd4769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-all-non-platform"

RDEPENDS:${PN} += "python39-PyHamcrest \
python39-Twisted-conch \
python39-Twisted-contextvars \
python39-Twisted-http2 \
python39-Twisted-serial \
python39-Twisted-tls"

inherit rpm
