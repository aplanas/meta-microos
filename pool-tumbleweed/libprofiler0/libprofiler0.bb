SUMMARY = "CPU and Heap profiling library"
DESCRIPTION = "This subpackage contains a library with cpu and heap profiling."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "libprofiler0-2.10-1.5.aarch64.rpm"
RPM_HASH = "6e1526ace7aabbef1c9b45047c3fb8f37da92e2e77fe6f8606beb2f5f5e0ac96c10b6a406ae10559c840f53d5d0e6c465f87d2e36344880dc15dad5c3e9eb48b"

RPROVIDES:${PN} += "libprofiler.so.0 \
libprofiler0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
