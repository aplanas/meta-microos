SUMMARY = "Libraries for the hpx package"
DESCRIPTION = "HPX is a general purpose C++ runtime system for parallel and distributed applications of any scale. \
 \
This package contains libraries for the hpx package."
LICENSE = "BSL-1.0"

PV = "1.8.1"

RPM_NAME = "libhpx1-1.8.1-2.2.aarch64.rpm"
RPM_HASH = "d785f3893297eaaa9da7a590e63e798aedd2f7fb1a6260a03809514c69fc54981f0b6fae6f68b9e4f96d15476727c418b1fca30b09cfcc5d4d87551afb1a8de4"

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
