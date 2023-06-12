SUMMARY = "Qt 6 HttpServer library"
DESCRIPTION = "QHttpServer is a simplified API for QAbstractHttpServer and QHttpServerRouter."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6HttpServer6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6aaaf9c878d61d1c73353aa7655ccccd11efc5cc4a0303a412f8e60b1b44330b64b642ff1060f48f6e25a872d48490bf32a561b2564f94adc345581fe57deff0"

RPROVIDES:${PN} += "libQt6HttpServer.so.6()(64bit) \
libQt6HttpServer.so.6(Qt_6)(64bit) \
libQt6HttpServer.so.6(Qt_6.0)(64bit) \
libQt6HttpServer.so.6(Qt_6.1)(64bit) \
libQt6HttpServer.so.6(Qt_6.2)(64bit) \
libQt6HttpServer.so.6(Qt_6.3)(64bit) \
libQt6HttpServer.so.6(Qt_6.4)(64bit) \
libQt6HttpServer.so.6(Qt_6.5)(64bit) \
libQt6HttpServer.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6HttpServer6 \
libQt6HttpServer6(aarch-64)"
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
libQt6WebSockets.so.6()(64bit) \
libQt6WebSockets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
