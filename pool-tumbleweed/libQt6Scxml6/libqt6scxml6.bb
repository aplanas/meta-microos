SUMMARY = "Qt 6 Scxml library"
DESCRIPTION = "The Qt 6 Scxml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Scxml6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "61e3fe85f1187eb2e1a05feafcbc133589ab2870e91fd2584815a6894dd84f27d8e5b3003ecf9b9b70ffa440cbc84e819dac3dd460ef8ed2b8f720178f8c8ede"

RPROVIDES:${PN} += "libQt6Scxml.so.6()(64bit) \
libQt6Scxml.so.6(Qt_6)(64bit) \
libQt6Scxml.so.6(Qt_6.0)(64bit) \
libQt6Scxml.so.6(Qt_6.1)(64bit) \
libQt6Scxml.so.6(Qt_6.2)(64bit) \
libQt6Scxml.so.6(Qt_6.3)(64bit) \
libQt6Scxml.so.6(Qt_6.4)(64bit) \
libQt6Scxml.so.6(Qt_6.5)(64bit) \
libQt6Scxml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Scxml6 \
libQt6Scxml6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
