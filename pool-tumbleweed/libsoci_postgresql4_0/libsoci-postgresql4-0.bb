SUMMARY = "PostgreSQL back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for PostgreSQL."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_postgresql4_0-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "c826f486399790c22e499f4d0c3cc0b1515af2fb040436a43b921a65f369e62eb79fb44c53fbbdd7228d4156e78a6c74714fb7effb8557c9a311276068be5e2a"

RPROVIDES:${PN} += "libsoci4_0-backend \
libsoci_postgresql.so.4.0()(64bit) \
libsoci_postgresql4_0 \
libsoci_postgresql4_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpq.so.5()(64bit) \
libsoci_core.so.4.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
