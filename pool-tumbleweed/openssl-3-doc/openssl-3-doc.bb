SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "openssl-3-doc-3.1.1-2.1.noarch.rpm"
RPM_HASH = "c75d3e51650c946feda00a89720c898fd3450d1e2ef493850dfda1f180d0c208cee494cfd174eba8f8215349b9839931f5d4a595e5c53bb0bf53c2b4a36ea769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-3-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
