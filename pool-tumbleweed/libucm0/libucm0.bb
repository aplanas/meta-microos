SUMMARY = "Memory (un)happing hooks for Unified Communication X"
DESCRIPTION = "libucm is a standalone non-unloadable library which installs hooks \
for virtual memory changes in the current process."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucm0-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "a630ffb7caf9dca2b370e7afaedf8ae8398ed344e4178fe2280052c1cedca7a044261e327b88a984f97fea67dbfd58bf2f8289cdd739b4ee8b51c74e7b66c7e3"

RPROVIDES:${PN} += "libucm.so.0 \
libucm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
