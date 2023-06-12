SUMMARY = "A GObject-based Exiv2 wrapper"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "libgexiv2-2-0.14.1-1.1.aarch64.rpm"
RPM_HASH = "258ef88d1dc586eae801bdc273cd01fa0c7658e56b45164dc69b3de027001eb60d45f2c4dc9e6f82190de2e187ec000671ff6f519706ab06e46a3640296dbc99"

RPROVIDES:${PN} += "libgexiv2-2 \
libgexiv2-2(aarch-64) \
libgexiv2.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
