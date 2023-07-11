SUMMARY = "Graph Coloring Library for C/C++"
DESCRIPTION = "This package provides algorithms for efficient solution of partitioning \
problems occuring in the analysis of sparsity patterns in derivative \
computations formulated as Graph Coloring problems. \
 \
For details see http://www.cscapes.org/coloringpage/software.htm"
LICENSE = "LGPL-3.0"

PV = "1.0.10"

RPM_NAME = "libColPack0-1.0.10-1.25.aarch64.rpm"
RPM_HASH = "e16a1249165a56445a98b37fb09adb2e4f775a76083cb66f2ad7fc5997f6ed97397092993fd66d07a916519ae0ee3e91ac8c1fa4e7aa790d8302fdb20a057965"

RPROVIDES:${PN} += "libColPack.so.0 \
libColPack0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
