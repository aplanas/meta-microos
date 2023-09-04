SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "openssl-3-doc-3.1.2-1.1.noarch.rpm"
RPM_HASH = "b4febed481e06fdaa667e8bf8a3fec39afc6580c41c463a39e00f0cfb4269458a5db64d90315470eb7588e55733253f1f0a04e8c51047bd29f80582285e2bf99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-3-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
