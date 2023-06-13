SUMMARY = "The C++ Database Access Library"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_core4_0-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "b6d6de7b3ad02c2326894ce3d03061dc1e8c6178657f2a0ada416d82b9ccb0cfaabeb5303c4781f208b94fac8b3e4a6a94c25c4d0988281ec4c94a6bd788dbc0"

RPROVIDES:${PN} += "libsoci_core.so.4.0()(64bit) \
libsoci_core4_0 \
libsoci_core4_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libsoci4_0-backend \
libstdc++.so.6()(64bit)"

inherit rpm
