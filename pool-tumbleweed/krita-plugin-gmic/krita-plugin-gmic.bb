SUMMARY = "GMIC plugin for krita"
DESCRIPTION = "This is a plugin for krita to provide gmic features."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "krita-plugin-gmic-3.2.5-1.1.aarch64.rpm"
RPM_HASH = "8570bc4a739efeef4bda8903814698a919c513238650baaf4440d626b54afa82ef58e56e6a9458bf3e5351d8cf846f27fbd704a9c436d4954c556684be9fca08"

RPROVIDES:${PN} += "krita-plugin-gmic"

RDEPENDS:${PN} += "gmic-data \
krita \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libfftw3-threads.so.3 \
libgcc-s.so.1 \
libgmic.so.3 \
libgomp.so.1 \
libkritaqmicinterface.so.18 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
