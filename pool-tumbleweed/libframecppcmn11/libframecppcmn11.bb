SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecppcmn11-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "f7dd61d24191e14d804e5b5c2ad3cd45cadeeb1c7a4861bc0b12fef960773fbf17b7d05178cf9d7fd990ca8d33124fe670ecc05e45fbae1efbc116c41934df7b"

RPROVIDES:${PN} += "libframecppcmn.so.11()(64bit) \
libframecppcmn11 \
libframecppcmn11(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libldastoolsal.so.7()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
