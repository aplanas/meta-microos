SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "OpenSSL"

PV = "1.1.1v"

RPM_NAME = "openssl-1_1-doc-1.1.1v-1.1.noarch.rpm"
RPM_HASH = "9b1f45071bd0aa3419210645ad3d25b921451f47614a83e50c5ae1d54b9643dc857be402be077235d13c5fa2c5601578305a8fa37d94dc7e5a6384726662f584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-1-1-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
