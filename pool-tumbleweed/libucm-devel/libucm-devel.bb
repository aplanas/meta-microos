SUMMARY = "Development files for Unified Communication X Memory Hooks"
DESCRIPTION = "libucm is a standalone non-unloadable library which installs hooks \
for virtual memory changes in the current process."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucm-devel-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "a6fd24e3a86d69d8756494f34eeec3c7fd3c1e8a4313b70f6baf5a96c619d0c9c421a3c315ea0dbef058ad58498329d48da5611df6d079a3b030a5cd87cf71a2"

RPROVIDES:${PN} += "libucm-devel"

RDEPENDS:${PN} += "libucm0"

inherit rpm
