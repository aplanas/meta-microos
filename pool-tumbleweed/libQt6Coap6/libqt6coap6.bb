SUMMARY = "Qt 6 CoAP Client Library"
DESCRIPTION = "Qt 6 library to implement a CoAP client."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Coap6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1fb1a6337d5a78a2790e0c045a26a87f42596f244140289047c1567e6d663e708e258ce9eb64f0d1519d30525eb5edcbba75198dded6bb7a79dc784f2a7fc1e0"

RPROVIDES:${PN} += "libQt6Coap.so.6()(64bit) \
libQt6Coap.so.6(Qt_6)(64bit) \
libQt6Coap.so.6(Qt_6.0)(64bit) \
libQt6Coap.so.6(Qt_6.1)(64bit) \
libQt6Coap.so.6(Qt_6.2)(64bit) \
libQt6Coap.so.6(Qt_6.3)(64bit) \
libQt6Coap.so.6(Qt_6.4)(64bit) \
libQt6Coap.so.6(Qt_6.5)(64bit) \
libQt6Coap.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Coap6 \
libQt6Coap6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Network.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
