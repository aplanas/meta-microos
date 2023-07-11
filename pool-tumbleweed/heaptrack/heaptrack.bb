SUMMARY = "Heap Memory Allocation Profiler"
DESCRIPTION = "A memory profiler for Linux, tracking heap allocations."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "heaptrack-1.4.0-4.5.aarch64.rpm"
RPM_HASH = "195b7dd15973e5552c91664ef82dd0e87f0ee89e385605983014e22090199369839d107fea41d002d43ea93bc264af91cfc91a7320016d8402dd365f7bfb6eaf"

RPROVIDES:${PN} += "heaptrack \
libheaptrack-inject.so \
libheaptrack-preload.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
