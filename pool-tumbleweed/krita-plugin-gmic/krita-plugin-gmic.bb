SUMMARY = "GMIC plugin for krita"
DESCRIPTION = "This is a plugin for krita to provide gmic features."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "krita-plugin-gmic-3.2.5-1.1.aarch64.rpm"
RPM_HASH = "8570bc4a739efeef4bda8903814698a919c513238650baaf4440d626b54afa82ef58e56e6a9458bf3e5351d8cf846f27fbd704a9c436d4954c556684be9fca08"

RPROVIDES:${PN} += "krita-plugin-gmic \
krita-plugin-gmic(aarch-64)"

RDEPENDS:${PN} += "gmic-data \
krita \
ld-linux-aarch64.so.1()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libfftw3_threads.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgmic.so.3()(64bit) \
libgomp.so.1()(64bit) \
libkritaqmicinterface.so.18()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
