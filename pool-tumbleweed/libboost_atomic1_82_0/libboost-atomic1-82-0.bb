SUMMARY = "Boost.Atomic runtime library"
DESCRIPTION = "Run-Time support for Boost.Atomic, a library that provides atomic data types \
and operations on these data types, as well as memory ordering constraints \
required for coordinating multiple threads through atomic variables."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_atomic1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "af866cc329c235076c8d881c8666846346941fc65d2ca93f0911a8478efc89aa72d36c18af3668bf141eb016bfccefaaab5446f4c03c58f32e2a64a0b0e8c1de"

RPROVIDES:${PN} += "libboost-atomic.so.1.82.0 \
libboost-atomic1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
