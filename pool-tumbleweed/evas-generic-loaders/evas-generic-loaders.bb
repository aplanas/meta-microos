SUMMARY = "Set of generic loaders for Evas"
DESCRIPTION = "Set of generic loaders allowing to open XCF, PDF, PS, RAW, \
MPG/AVI/OGV/MOV/MKV/WMV. \
 \
Useful only for evas library. \
 \
This part of the Enlightenment Foundation Libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.3"

RPM_NAME = "evas-generic-loaders-1.26.3-30.6.aarch64.rpm"
RPM_HASH = "dd04671da25e8c19494665c115e4c3354ba3c53fdb954f7448711593dec7657ba43fd628224e9ad98fcfadc8c16a0f895da8b6b1da1985f590b93fcc5ab573b7"

RPROVIDES:${PN} += "evas-generic-loaders \
evas-generic-loaders(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libeina.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libpoppler-cpp.so.0()(64bit) \
libraw.so.23()(64bit) \
librsvg-2.so.2()(64bit) \
libspectre.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libz.so.1()(64bit)"

inherit rpm
