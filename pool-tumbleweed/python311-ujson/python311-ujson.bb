SUMMARY = "JSON encoder and decoder for Python"
DESCRIPTION = "An ultrafast JSON encoder and decoder written in pure C with \
bindings for Python 2.7 and 3.5+"
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python311-ujson-5.7.0-1.2.aarch64.rpm"
RPM_HASH = "73cc469bb30d125e8bb5f74f0aaad1bad1e10065a608d415fa366662818231a84d69b6645b55136f01416268a6d862fbf16e528988bd68e454381359483ea0cc"

RPROVIDES:${PN} += "python3.11dist(ujson) \
python311-ujson \
python311-ujson(aarch-64) \
python3dist(ujson)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdouble-conversion.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi)"

inherit rpm
