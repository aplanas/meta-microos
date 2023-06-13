SUMMARY = "The all_non_platform dependency extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency all_non_platform"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-all_non_platform-22.10.0-6.1.noarch.rpm"
RPM_HASH = "3792ded5238e96b9a3e0d5558143fd827cc1744c4d2472c55cd768135d957baae767b22d9178349b994fdcb4c96a2684a4ec4fc60d595629a6a368a5ad0df5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-all_non_platform \
python310-Twisted-all_non_platform"

RDEPENDS:${PN} += "python310-PyHamcrest \
python310-Twisted-conch \
python310-Twisted-contextvars \
python310-Twisted-http2 \
python310-Twisted-serial \
python310-Twisted-tls"

inherit rpm
