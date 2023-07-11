SUMMARY = "RAR Archive Reader for Python (Documentation)"
DESCRIPTION = "Python module for RAR archive reading. \
 \
This package contains technical documentation."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python39-rarfile-doc-4.0-3.7.noarch.rpm"
RPM_HASH = "159684772118218ef988a68e1f64cc684a2dd9ff22dd9c1e94e1c6c733c93d4656c07b50f56f050601bf7ad2cde0fc962cff0b098c1d6f5ed34dd74605fa0dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-rarfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
