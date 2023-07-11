SUMMARY = "Threading Building Blocks (TBB) NUMA support library"
DESCRIPTION = "The NUMA support library for Threading Building Blocks (TBB)"
LICENSE = "Apache-2.0"

PV = "2021.9.0"

RPM_NAME = "libtbbbind_2_5-3-2021.9.0-1.1.aarch64.rpm"
RPM_HASH = "f893352aeae13d6c7472bbb9f8d97e166659633b93795ae91d8e13e3948e0e645011ee832cf269d5e9f07e082d0a81b72cd383c6d7f0bbeeb110f9df6573834a"

RPROVIDES:${PN} += "libtbbbind-2-5-3 \
libtbbbind-2-5.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhwloc.so.15 \
libstdc++.so.6"

inherit rpm
