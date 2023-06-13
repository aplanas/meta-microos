SUMMARY = "Qt 5 BodyMovin Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package includes a library for reading BodyMovin animation files."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Bodymovin5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "d8740f32f08e6262b21c855d0f9566c3174e86760aba5a66fdf81725156b2c31d09f8cd702bbd3388f9ed984eed5f0824c7fddb14846d83a4b544db57289b52c"

RPROVIDES:${PN} += "libQt5Bodymovin.so.5()(64bit) \
libQt5Bodymovin5 \
libQt5Bodymovin5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
