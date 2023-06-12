SUMMARY = "Application for updating Flipper Zero firmware - protocol library"
DESCRIPTION = "Application for updating Flipper Zero firmware - protocol library"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1~rc1+git1.1684488882.0199220"

RPM_NAME = "qFlipper-libflipperproto-1.3.1~rc1+git1.1684488882.0199220-1.1.aarch64.rpm"
RPM_HASH = "6cc3967810ecd002f1e9c62d78f7115e2dff4b7fd2b962b84513c6ffb2672e46fd5821c240dd0b4d26f888b1500d0a0db84115615ca0e43237d8858dda6cd5e5"

RPROVIDES:${PN} += "libflipperproto0.so()(64bit) \
qFlipper-libflipperproto \
qFlipper-libflipperproto(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
