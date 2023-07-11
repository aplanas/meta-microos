SUMMARY = "A Bonnie-Like File System Benchmark"
DESCRIPTION = "Bonnie++ is a benchmark suite aimed at performing a number of simple \
hard drive and file system performance tests."
LICENSE = "MIT"

PV = "2.00a"

RPM_NAME = "bonnie++-2.00a-1.4.aarch64.rpm"
RPM_HASH = "924675052e4d4b6dd359959e2d2b0c82bf010c9a44559f264bc6c635cefe1ac127bfb3c628e4d17d8ade31e4991157d899cc17e998c7e425a0cdd19540bda5bc"

RPROVIDES:${PN} += "bonnie++"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
