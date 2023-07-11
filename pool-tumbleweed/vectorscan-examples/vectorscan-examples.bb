SUMMARY = "Example binaries for the vectorscan library"
DESCRIPTION = "Example binaries for the vectorscan library: \
  benchmarks, hsbench, hscheck, hscollider, patbench, \
  pcapscan, simplegrep, unit-hyperscan, unit-internal"
LICENSE = "BSD-3-Clause"

PV = "5.4.9"

RPM_NAME = "vectorscan-examples-5.4.9-2.2.aarch64.rpm"
RPM_HASH = "acf6bc961a59f37034031a53929f9444f4b96b6893f8c59c46b83954372af0f71e96ee89508774c01aa32f001c354e8bb026a625f14a85d8329753118b9bcfc6"

RPROVIDES:${PN} += "vectorscan-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhs.so.5 \
libm.so.6 \
libpcap.so.1 \
libpcre.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
