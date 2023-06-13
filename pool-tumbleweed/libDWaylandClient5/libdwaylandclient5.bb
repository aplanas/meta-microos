SUMMARY = "DWayland Client Library"
DESCRIPTION = "DWayland is a Qt-style API to interact with the wayland-client API."
LICENSE = "LGPL-2.1-or-later"

PV = "5.24.3"

RPM_NAME = "libDWaylandClient5-5.24.3-1.3.aarch64.rpm"
RPM_HASH = "c7db34fd000b03e009b08af21453fdde9672857c6222c7e974a35d8be3ee963afa249790d000c98dd51bc05f5560db0ca899aa1c92a5b92ec19c573ba98f7b4e"

RPROVIDES:${PN} += "libDWaylandClient.so.5()(64bit) \
libDWaylandClient5 \
libDWaylandClient5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
