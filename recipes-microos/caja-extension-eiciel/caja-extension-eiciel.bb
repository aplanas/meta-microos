SUMMARY = "Caja extension for the ACL viewer and editor"
DESCRIPTION = "A Caja extension that allows viewing and editing ACL permissions."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.1"

RPM_NAME = "caja-extension-eiciel-1.20.1-2.9.aarch64.rpm"
RPM_HASH = "8d3201c9dabb707b20449527a8325c665cc2c93df76ee16f86689dcdb6ad9472d39d560c6461eae227ad0222f50fe31257848bc002c46e9ef51fd07e09c330b0"

RPROVIDES:${PN} += "caja-extension-eiciel caja-extension-eiciel(aarch-64) libeiciel-caja.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libatkmm-1.6.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit) libcairomm-1.0.so.1()(64bit) libcaja-extension.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdkmm-3.0.so.1()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libglibmm-2.4.so.1()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtkmm-3.0.so.1()(64bit) libsigc-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) mate-eiciel"

inherit rpm
