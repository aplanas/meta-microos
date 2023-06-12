SUMMARY = "C++ Binding for the ATK library -- Shared Library"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort. \
 \
This package provides the ATK library's C++'s bindings shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.36.2"

RPM_NAME = "libatkmm-2_36-1-2.36.2-2.3.aarch64.rpm"
RPM_HASH = "236a93b8f5dcbda3f6f86c181b031e8636cdb9ce9a3c1ed1a612a97cb274c9eeb59c56b450d4059651770f58572705fb816730da592d000779eefb6d7c4dd833"

RPROVIDES:${PN} += "libatkmm-2.36.so.1()(64bit) \
libatkmm-2_36-1 \
libatkmm-2_36-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.68.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsigc-3.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
