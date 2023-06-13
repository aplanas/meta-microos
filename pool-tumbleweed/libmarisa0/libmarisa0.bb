SUMMARY = "Matching Algorithm with Recursively Implemented StorAge"
DESCRIPTION = "The libmarisa0 package contains runtime libraries for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "libmarisa0-0.2.6-1.21.aarch64.rpm"
RPM_HASH = "0d017724cf017dd0f9186e32789081aa415ddea6e8929ffd5688738eab949c68f27454a92753c0d6a2c16e1794114f778eaf518ee317d3ea4c8ddd771c4899b7"

RPROVIDES:${PN} += "libmarisa.so.0()(64bit) \
libmarisa0 \
libmarisa0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
