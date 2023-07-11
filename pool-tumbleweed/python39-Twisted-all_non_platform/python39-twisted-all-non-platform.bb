SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-all_non_platform-22.10.0-7.1.noarch.rpm"
RPM_HASH = "08e6fee481ba2c51c0a7cd9453b1ff92023cdb2c866cc2953ff13c1c88779755e270fd14071ecc1e2af221eb34aa3b780b608fd39b2e7dd3aafe54d9ccfb36f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-all-non-platform"

RDEPENDS:${PN} += "python39-PyHamcrest \
python39-Twisted-conch \
python39-Twisted-contextvars \
python39-Twisted-http2 \
python39-Twisted-serial \
python39-Twisted-tls"

inherit rpm
