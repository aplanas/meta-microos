SUMMARY = "CPU and Heap profiling library"
DESCRIPTION = "This subpackage contains a library with cpu and heap profiling."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libprofiler0-2.10-1.6.aarch64.rpm"
RPM_HASH = "6ae40577109ebd430bbe1c976b9b1cb4aeda88d848354e6bd504acb0055404ee7d54854727d609e4b422fd8795f8067f329e423cdd7e7c285e52f3cf576b5a5a"

RPROVIDES:${PN} += "libprofiler.so.0 \
libprofiler0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
