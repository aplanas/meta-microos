SUMMARY = "Demo for hsqldb"
DESCRIPTION = "Demonstrations and samples for hsqldb."
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "hsqldb-demo-2.7.2-1.1.noarch.rpm"
RPM_HASH = "1499477da40af78e6543fb9df10af9a20b6839429b423f8ae6d7afd0034b1f968606a97ca2f1794545f4a7ee1b053924c5fe12dcae83cd5854e6935d8d1ba821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hsqldb-demo"

RDEPENDS:${PN} += "hsqldb"

inherit rpm
