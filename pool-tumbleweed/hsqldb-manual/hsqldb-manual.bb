SUMMARY = "Manual for hsqldb"
DESCRIPTION = "Manual for hsqldb."
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "hsqldb-manual-2.7.2-1.1.noarch.rpm"
RPM_HASH = "5a3b1fc066fef8bce492980e6dc02a63cda41ad7342b948466c569f335af7ba9056db3624a0ce423765159a2ae8c8e43bbf55ae1e1a6c38d22469dd5aea00308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hsqldb-manual"

RDEPENDS:${PN} += ""

inherit rpm
