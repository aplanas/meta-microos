SUMMARY = "Basic data structures in C (libstdc++ wrapper)"
DESCRIPTION = "Library that offers basic data structures (list, set, map, ..) \
in a C API for user-space applications. \
 \
Key features: \
 - No 'magic' MACROs, and no need to modify your data structures \
   (except, perhaps, for __attribute__((packed))) \
 - Uses C++ standard library as the backend for most data structures"
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "libcdada0-0.4.0-1.7.aarch64.rpm"
RPM_HASH = "20ab5029eb5ad3b759451f2f0d4d0d52c6481086e5d4592389d2f2a80e5b85718ecd56e7915009f1fdbdbf74c80a4aa069bb6dcae377028f712e4f37ecbc2b5f"

RPROVIDES:${PN} += "libcdada.so.0 \
libcdada0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
