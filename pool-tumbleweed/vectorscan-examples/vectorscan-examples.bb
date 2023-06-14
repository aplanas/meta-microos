SUMMARY = "Example binaries for the vectorscan library"
DESCRIPTION = "Example binaries for the vectorscan library: \
  benchmarks, hsbench, hscheck, hscollider, patbench, \
  pcapscan, simplegrep, unit-hyperscan, unit-internal"
LICENSE = "BSD-3-Clause"

PV = "5.4.9"

RPM_NAME = "vectorscan-examples-5.4.9-2.1.aarch64.rpm"
RPM_HASH = "6ba17d0891cd578de2b5c0217f9488bc30c2ccdc1e0c64bf4d74f4c59ec6f2951cf898393c8fa3bf05b2c41defa00afe3cd459d79d96a058cf0dcbe3a77f8782"

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
