SUMMARY = "Development files for Unified Communication X Memory Hooks"
DESCRIPTION = "libucm is a standalone non-unloadable library which installs hooks \
for virtual memory changes in the current process."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucm-devel-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "0f2c8029af56770e598a53f2129dd4b25b9c9e4754cd8474fb5d808293c8586113a8f1bef7ab7898113777a6d5848924d43f4adb359f614a1802890e9b8ebef1"

RPROVIDES:${PN} += "libucm-devel \
libucm-devel(aarch-64)"
RDEPENDS:${PN} += "libucm0"

inherit rpm
