SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp12-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "4bc27bb4697f55a05e2fe864c2c868d7b22b951f80c68a2617c90b6435c8060a4fe6080be6032f29bcbbee77846c19519eaf25873ed0d708a647fb1623ad2141"

RPROVIDES:${PN} += "libframecpp.so.12()(64bit) \
libframecpp12 \
libframecpp12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libframecpp3.so.6()(64bit) \
libframecpp4.so.8()(64bit) \
libframecpp6.so.8()(64bit) \
libframecpp7.so.4()(64bit) \
libframecpp8.so.7()(64bit) \
libframecppcmn.so.11()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libldastoolsal.so.7()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
