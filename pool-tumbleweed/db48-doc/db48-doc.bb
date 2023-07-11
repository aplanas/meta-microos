SUMMARY = "Documentation for Berkeley DB"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the documentation."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "db48-doc-4.8.30-42.1.noarch.rpm"
RPM_HASH = "fd2cb8c87dae06f59fc70cb7eed02025c1ce51800a3c88ab83e0c8741d8bdda48c4cdc8dfdca3b246e9003c49f2dfe8b3c3caa4f1d73fb6937c25e07af394509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "db-doc \
db-utils-doc \
db48-doc"

RDEPENDS:${PN} += ""

inherit rpm
