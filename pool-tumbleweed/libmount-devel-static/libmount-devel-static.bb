SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libmount-devel-static-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "d1c2d938c86eb64b3b8f91f1589f899b5810b26665e466c2c117151a9192eb2103d35680340559bfea01c8d34a7e2b31f7518f6a24777506aade321f4273caf6"

RPROVIDES:${PN} += "libmount-devel-static"

RDEPENDS:${PN} += "libmount-devel"

inherit rpm
