SUMMARY = "Documentation for Berkeley DB"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the documentation."
LICENSE = "Sleepycat"

PV = "4.8.30"

RPM_NAME = "db48-doc-4.8.30-41.1.noarch.rpm"
RPM_HASH = "83db15723863f64b6fd915c8f2398bd1187283b45ccf8e7f6a2ccdd904e6cce283537cc1c0616af7483de930933ca2f22e77de32cab67f80ae9158668c7e87ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "db-doc \
db-utils-doc \
db48-doc"
RDEPENDS:${PN} += ""

inherit rpm
