SUMMARY = "Library to generate ODF documents from libwpd's and libwpg's api calls"
DESCRIPTION = "libodfgen is a general purpose library designed to generate ODF documents \
from api calls to libwpd and libwpg libraries."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.1.8"

RPM_NAME = "libodfgen-0_1-1-0.1.8-3.8.aarch64.rpm"
RPM_HASH = "b01414be30c6b263026d8ce97b5de09099db844e9af92b090ad25f6d849b87d6061be651bb0f24e5d389795555ec218cd093dc8bf8a099df4d7f4d3d9261ba69"

RPROVIDES:${PN} += "libodfgen-0.1.so.1()(64bit) \
libodfgen-0_1-1 \
libodfgen-0_1-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
librevenge-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm