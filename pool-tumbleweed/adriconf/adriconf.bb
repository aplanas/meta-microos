SUMMARY = "Advanced DRI Configurator"
DESCRIPTION = "adriconf (Advanced DRI CONFigurator) is a GUI tool used to configure open \
source graphics drivers. It works by setting options and writing them to \
the standard drirc file used by the Mesa drivers."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "adriconf-2.7.0-1.1.aarch64.rpm"
RPM_HASH = "3b7d3abb4a4b9abaf2fa2fa127aee8485b45a238fb156eaa0789aa9912fedac87d8ba7b581d633cf4d9906ed8f02d1d88491c1453fb1cfd13a2d60e8a6fd6796"

RPROVIDES:${PN} += "adriconf \
adriconf(aarch-64) \
application() \
application(adriconf.desktop)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libgbm.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libgiomm-2.68.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.68.so.1()(64bit) \
libgtkmm-4.0.so.0()(64bit) \
libpci.so.3()(64bit) \
libpci.so.3(LIBPCI_3.0)(64bit) \
libpci.so.3(LIBPCI_3.5)(64bit) \
libpugixml.so.1()(64bit) \
libsigc-3.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
