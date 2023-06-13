SUMMARY = "Libyui - REST API plugin for the Ncurses frontend"
DESCRIPTION = "This package provides a libyui REST API plugin for the \
Ncurses frontend. \
 \
It allows inspecting and controlling the UI remotely via \
an HTTP REST API. This is designed for automated tests."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-ncurses-rest-api16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "78fabad294204da3bb1bf5f73efabf57291e146ed64b15b1db7f66f547c8ce4f3890f7c89d3dacafcf8cb5a4e8d102d6c7ccc5d6583d1d0fc1cec98349ffcadf"

RPROVIDES:${PN} += "libyui-ncurses-rest-api \
libyui-ncurses-rest-api.so.16()(64bit) \
libyui-ncurses-rest-api16 \
libyui-ncurses-rest-api16(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libyui-ncurses16 \
libyui-rest-api16 \
libyui.so.16()(64bit) \
libyui16 \
yui_backend"

inherit rpm
