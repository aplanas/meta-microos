SUMMARY = "Heap Memory Allocation Profiler"
DESCRIPTION = "A memory profiler for Linux, tracking heap allocations."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "heaptrack-1.4.0-4.4.aarch64.rpm"
RPM_HASH = "d41c95fb10a40cbb96fa627e1ce1e93d16b619adda4467ed830009570b06770db1a8880e2a7dc9b01869483c64ef497b8e48d88c29e5cbfd926ebc8ba9d21d9a"

RPROVIDES:${PN} += "heaptrack \
libheaptrack-inject.so \
libheaptrack-preload.so"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
