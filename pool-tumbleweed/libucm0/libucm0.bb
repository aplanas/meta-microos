SUMMARY = "Memory (un)happing hooks for Unified Communication X"
DESCRIPTION = "libucm is a standalone non-unloadable library which installs hooks \
for virtual memory changes in the current process."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucm0-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "07c1b4a41958e0e1beb72561f02f2bc79cdaa10b1f0353c6aefa0220dc2f5fc76a42a39386c04f0979418769d69c9fd5ad4a2f3d646721aeccdda8d4882a8978"

RPROVIDES:${PN} += "libucm.so.0 \
libucm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
