SUMMARY = "Demo for hsqldb"
DESCRIPTION = "Demonstrations and samples for hsqldb."
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "hsqldb-demo-2.7.1-1.2.noarch.rpm"
RPM_HASH = "6ead43b677a3fe2e9f23696268486ce5ed17726508b7c34047fd74d0a24dc7f439bd7274db52cae7a874809a7728364b0f22c96575212adacd653b65db33f0be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hsqldb-demo"

RDEPENDS:${PN} += "hsqldb"

inherit rpm
