SUMMARY = "Libraries for the hpx package"
DESCRIPTION = "HPX is a general purpose C++ runtime system for parallel and distributed applications of any scale. \
 \
This package contains libraries for the hpx package."
LICENSE = "BSL-1.0"

PV = "1.8.1"

RPM_NAME = "libhpx1-1.8.1-2.2.aarch64.rpm"
RPM_HASH = "d785f3893297eaaa9da7a590e63e798aedd2f7fb1a6260a03809514c69fc54981f0b6fae6f68b9e4f96d15476727c418b1fca30b09cfcc5d4d87551afb1a8de4"

RPROVIDES:${PN} += "libhpx.so.1()(64bit) \
libhpx1 \
libhpx1(aarch-64) \
libhpx_component_storage.so.1()(64bit) \
libhpx_io_counters.so.1()(64bit) \
libhpx_iostreams.so.1()(64bit) \
libhpx_memory.so.1()(64bit) \
libhpx_parcel_coalescing.so.1()(64bit) \
libhpx_partitioned_vector.so.1()(64bit) \
libhpx_process.so.1()(64bit) \
libhpx_unordered.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhpx_core.so()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtcmalloc_minimal.so.4()(64bit) \
openmpi4-libs"

inherit rpm
