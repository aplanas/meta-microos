SUMMARY = "GUI for cadabra2: computer algebra system for problems in field theory"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides the GUI for cadabra2 and it's desktop menu integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.3.2"

RPM_NAME = "cadabra2-gui-2.4.3.2-1.5.aarch64.rpm"
RPM_HASH = "aaa65f77783a29b1f4a16259958064c0fc5b3c3eb9548eb1154b32b522f7db7161db459e54458cb998d5b14897a832e33b0a554d0beac58db2dd5bba3339ed4f"

RPROVIDES:${PN} += "application() \
application(cadabra2-gtk.desktop) \
cadabra \
cadabra2-gui \
cadabra2-gui(aarch-64) \
metainfo() \
metainfo(cadabra2-gtk.appdata.xml) \
mimehandler(application/cadabra) \
mimehandler(application/x-cadabra)"
RDEPENDS:${PN} += "cadabra2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatkmm-1.6.so.1()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcairomm-1.0.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
