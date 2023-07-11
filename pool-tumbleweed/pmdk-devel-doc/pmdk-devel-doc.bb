SUMMARY = "Man pages for the libpmem C API"
DESCRIPTION = "Documentation for the pmem library interface."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "pmdk-devel-doc-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "cc6c7d7551c3a2acdcb111d9813514c04b3a28176c552118e3f66ff396757ad74df31a8adde6f3e48c682d605d0f0335093e590c4e9e3c51b4bbe40182666952"

RPROVIDES:${PN} += "pmdk-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
