SUMMARY = "JsonRpc 2.0 protocol implementation"
DESCRIPTION = "JsonRpc 2.0 protocol implementation for Qt6."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6JsonRpc6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "974464eb130115bd85dc330e9a0dfbbb07ae40d8a2ac74164a29b1bc64ead67b491a92a99f31c6c3cd77b5afd184d0a826b5a75135b33faea38332a56501e538"

RPROVIDES:${PN} += "libQt6JsonRpc.so.6()(64bit) \
libQt6JsonRpc.so.6(Qt_6)(64bit) \
libQt6JsonRpc.so.6(Qt_6.0)(64bit) \
libQt6JsonRpc.so.6(Qt_6.1)(64bit) \
libQt6JsonRpc.so.6(Qt_6.2)(64bit) \
libQt6JsonRpc.so.6(Qt_6.3)(64bit) \
libQt6JsonRpc.so.6(Qt_6.4)(64bit) \
libQt6JsonRpc.so.6(Qt_6.5)(64bit) \
libQt6JsonRpc.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6JsonRpc6 \
libQt6JsonRpc6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
