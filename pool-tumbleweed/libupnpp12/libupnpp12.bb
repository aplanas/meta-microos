SUMMARY = "Library providing a higher level C++ API over libnpupnp or libupnp"
DESCRIPTION = "Libupnpp is a C++ wrapper for libupnp a.k.a Portable UPnP (up to branch 0.17), \
or its C++ descendant, libnpupnp (versions 0.18 and later). \
 \
Libupnpp can be used to implement UPnP devices and services, or Control Points. \
The Control Point side of libupnpp, which is documented here, \
allows a C++ program to discover UPnP devices, and exchange commands and status with them."
LICENSE = "GPL-2.0-or-later"

PV = "0.22.2"

RPM_NAME = "libupnpp12-0.22.2-1.3.aarch64.rpm"
RPM_HASH = "b22634a20bec549b2c782cbd10ffff8926350d580355b5d61b86d8ff9d9022d76bd810549c1c3306653187d7c469d3a654ca7a816bd0d12c1ddb2c0af2ab9ab0"

RPROVIDES:${PN} += "libupnpp.so.12()(64bit) \
libupnpp12 \
libupnpp12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libnpupnp.so.9()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
