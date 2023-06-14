SUMMARY = "Development files for pystring"
DESCRIPTION = "Development files for pystring."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "pystring-devel-1.1.3-1.8.aarch64.rpm"
RPM_HASH = "b5dd0218935c1e1427eeb9431eaa0c7bd0cd03b59e7fde891b3b1e69eda2d9232aa7970c06c040451f1f313b8f438b8ba37c9f7fcb7f12ac451e9783f826c4e0"

RPROVIDES:${PN} += "pystring-devel"

RDEPENDS:${PN} += "libpystring0-0"

inherit rpm
