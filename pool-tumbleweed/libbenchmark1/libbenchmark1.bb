SUMMARY = "Shared library for google benchmark"
DESCRIPTION = "A library to support the benchmarking of functions, similar to unit-tests."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "libbenchmark1-1.7.1-1.3.aarch64.rpm"
RPM_HASH = "ff376c592e48778c95eeae4e57657dbb75ee0d646154f418b16d92ae1dda20a781f4ae0d56f565c2513c69357228fe57edc7a5ca4c97d131236c99a849802eae"

RPROVIDES:${PN} += "libbenchmark-main.so.1 \
libbenchmark.so.1 \
libbenchmark1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
