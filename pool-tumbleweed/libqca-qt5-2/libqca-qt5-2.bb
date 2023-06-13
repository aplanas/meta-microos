SUMMARY = "QCA library"
DESCRIPTION = "The Qt cryptographic library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "libqca-qt5-2-2.3.6-1.1.aarch64.rpm"
RPM_HASH = "f2321a99ecd440cd16ba2671e6f257c4540bc8075e9a07b0d7a7cb27f4a1b9895d8b78c2a092195707147fcb437eb328e8efef86cbd3af780faafc7678b69543"

RPROVIDES:${PN} += "libqca-qt5 \
libqca-qt5-2 \
libqca-qt5-2(aarch-64) \
libqca-qt5.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
qca-qt5"

inherit rpm
