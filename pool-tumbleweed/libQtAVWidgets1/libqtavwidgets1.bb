SUMMARY = "QtAV Widgets module"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains a set of widgets to play media."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "libQtAVWidgets1-1.13.0-3.25.aarch64.rpm"
RPM_HASH = "c9e76d29d01ee1d138b1130658cdd66ce200a4709e3f01150697a4813999d89f0838897ebdbab4cd7d9f37ba2c1db0922f6aab04d08c4b884b9c7e0fb16f9663"

RPROVIDES:${PN} += "libQtAVWidgets.so.1()(64bit) \
libQtAVWidgets1 \
libQtAVWidgets1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQtAV.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXv.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
