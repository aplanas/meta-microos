SUMMARY = "Libraries for the hpx package"
DESCRIPTION = "HPX is a general purpose C++ runtime system for parallel and distributed applications of any scale. \
 \
This package contains libraries for the hpx package."
LICENSE = "BSL-1.0"

PV = "1.8.1"

RPM_NAME = "libhpx1-1.8.1-2.4.aarch64.rpm"
RPM_HASH = "e7c111413e49a9a0764643c07ca69f2bb932ba38a99719bc3a9dcccb0100d34bf0986d72d2bcfc0048a225dae4a0c7d5dfe7e3007c884bdece9a3e202b59d255"

RPROVIDES:${PN} += "libhpx-component-storage.so.1 \
libhpx-io-counters.so.1 \
libhpx-iostreams.so.1 \
libhpx-memory.so.1 \
libhpx-parcel-coalescing.so.1 \
libhpx-partitioned-vector.so.1 \
libhpx-process.so.1 \
libhpx-unordered.so.1 \
libhpx.so.1 \
libhpx1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhpx-core.so \
libm.so.6 \
libstdc++.so.6 \
libtcmalloc-minimal.so.4 \
openmpi4-libs"

inherit rpm
