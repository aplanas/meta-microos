SUMMARY = "Documentation for pgAdmin4"
DESCRIPTION = "pgAdmin 4 is a rewrite of the pgAdmin3 management tool for the \
PostgreSQL database. \
 \
This package contains the documentation for pgadmin4."
LICENSE = "PostgreSQL"

PV = "4.30"

RPM_NAME = "pgadmin4-doc-4.30-2.12.noarch.rpm"
RPM_HASH = "8f5fa2c95ba90511f2901ee6a27af598aaf9e197ca1905de311954a7b5d75812860c75cab778a75ae2d8f625a55eeb64cc501cf6e6f8511e611cd60988b1038a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pgadmin4-doc"

RDEPENDS:${PN} += ""

inherit rpm
