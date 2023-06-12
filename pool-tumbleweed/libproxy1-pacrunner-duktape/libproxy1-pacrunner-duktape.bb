SUMMARY = "Libproxy module to support WPAD/PAC parsing via the WebKit JavaScript Engine"
DESCRIPTION = "A module to extend libproxy with capabilities to pass addresses to a \
WPAD/PAC script and have it find the correct proxy. \
 \
Relies on tuktape to do the javascript parsing"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-pacrunner-duktape-0.4.18-2.1.aarch64.rpm"
RPM_HASH = "909d9aee8df04a0fa30a3e5762564f7d4a2481ae9897ad37fd1da2265772a885de2ad4a2d0664796d9d196fd991a8320e5440567928d159cff8dbf372de767df"

RPROVIDES:${PN} += "libproxy1-pacrunner \
libproxy1-pacrunner-duktape \
libproxy1-pacrunner-duktape(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libduktape.so.207()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libproxy.so.1()(64bit) \
libproxy1 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
