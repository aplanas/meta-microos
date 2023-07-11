SUMMARY = "Shared library for google benchmark"
DESCRIPTION = "A library to support the benchmarking of functions, similar to unit-tests."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "libbenchmark1-1.7.1-1.4.aarch64.rpm"
RPM_HASH = "7d69644d80fa4e702dd2666810bdd3806b297db404879604c830e620ee0a0feac880ba950d6f49a0049dd9a4c2bd896b4386e7c96e3623edc27eef1b8bbebf5a"

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
