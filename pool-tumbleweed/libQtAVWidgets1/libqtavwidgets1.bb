SUMMARY = "QtAV Widgets module"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains a set of widgets to play media."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "libQtAVWidgets1-1.13.0-3.25.aarch64.rpm"
RPM_HASH = "c9e76d29d01ee1d138b1130658cdd66ce200a4709e3f01150697a4813999d89f0838897ebdbab4cd7d9f37ba2c1db0922f6aab04d08c4b884b9c7e0fb16f9663"

RPROVIDES:${PN} += "libQtAVWidgets.so.1 \
libQtAVWidgets1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libQtAV.so.1 \
libX11.so.6 \
libXext.so.6 \
libXv.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
