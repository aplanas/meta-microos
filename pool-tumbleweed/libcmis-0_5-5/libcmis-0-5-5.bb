SUMMARY = "Library for accessing CMIS-enabled servers"
DESCRIPTION = "libcmis is a C++ client library for the CMIS (Content Management \
Interoperability Services) interface. This library allows C++ \
applications to connect to any CMIS-enabled repositories."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libcmis-0_5-5-0.5.2-1.24.aarch64.rpm"
RPM_HASH = "f09d3cab793a9cad2d0162153889bb2782c4074f18bcbd16a16fdfa5296acb15ae71b53523364c7f867df756b695ec5acb365868dcbfb808140e28c997e2eb04"

RPROVIDES:${PN} += "libcmis-0.5.so.5()(64bit) \
libcmis-0_5-5 \
libcmis-0_5-5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.25)(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
