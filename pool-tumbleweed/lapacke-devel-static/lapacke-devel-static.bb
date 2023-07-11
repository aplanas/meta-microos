SUMMARY = "LAPACKE static libraries"
DESCRIPTION = "LAPACKE development files - static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "lapacke-devel-static-3.9.0-9.2.aarch64.rpm"
RPM_HASH = "1316d8d63e1cd4134e6f47c8a1bbff969cefe4c48746c94f2750892e507afa22215eab3f8079c400e1caaebd7c286000838b3591f16b3f23d6a2a0c708f0d05c"

RPROVIDES:${PN} += "lapacke-devel-static"

RDEPENDS:${PN} += "lapacke-devel"

inherit rpm
