SUMMARY = "Shared library for Qt5 Widgets for Technical Applications"
DESCRIPTION = "This package contains the shared library to run Technical Applications \
developed with/for Qwt(Qt5)."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "libqwt6-qt5-6_2-6.2.0-2.1.aarch64.rpm"
RPM_HASH = "f44cd1c9140c88232e11e27cc891ac83de047c72888ee0f65848e70fff9aa51b046fdc64f060dc33608135e02f1e2b34b6db6936476e098abb9e8eb9a771cdd4"

RPROVIDES:${PN} += "libqwt-qt5.so.6.2()(64bit) \
libqwt6-qt5-6_2 \
libqwt6-qt5-6_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
