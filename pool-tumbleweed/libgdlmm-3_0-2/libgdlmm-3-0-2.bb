SUMMARY = "C++ interface for gdl"
DESCRIPTION = "gdlmm provides a C++ interface to the gdl library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.3"

RPM_NAME = "libgdlmm-3_0-2-3.7.3-8.22.aarch64.rpm"
RPM_HASH = "4c927491eca52ff3365793ff20885c884343712a0fd31199a7125f147f8be4837f535a3a27db7f8fb5d8f6eb23a23fd2856fa22784dca2b7cf94e1c47cd97cf6"

RPROVIDES:${PN} += "libgdlmm-3.0.so.2()(64bit) \
libgdlmm-3_0-2 \
libgdlmm-3_0-2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgdl-3.so.5()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
