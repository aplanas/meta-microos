SUMMARY = "Library for Importing Microsoft Word (tm) Documents"
DESCRIPTION = "The wv2 library is used to import Microsoft Word documents in koffice \
for example."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "libwv2-4-0.4.2-25.5.aarch64.rpm"
RPM_HASH = "d230b4b597abd071b55d8b1355da7933587e650fb95052f08363917847786ffc65b27262078f9581d106345c7e1426dfd63ed13dfc0f3ceec042d440c6b89924"

RPROVIDES:${PN} += "libwv2-4 \
libwv2-4(aarch-64) \
libwv2.so.4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgsf-1.so.114()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
