SUMMARY = "Interactive whiteboard for schools and universities"
DESCRIPTION = "OpenBoard is an open source cross-platform interactive white board \
application designed primarily for use in schools. It was \
originally forked from Open-Sankoré, which was itself based on \
Uniboard. \
 \
This build is based on the development branch 1.7-dev and includes \
a set of additional patches for features and bug fixes."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.0~git20221129.9de37af"

RPM_NAME = "OpenBoard-1.7.0~git20221129.9de37af-2.7.aarch64.rpm"
RPM_HASH = "f5f62a2afc85e74d46ee8b5d42e1e02bf1164a34a0aff06bd03d2777fcc8c6f8950ef5472e5748a87c34199375bba252e3356d29e589d378ed5dc56e2eacb67d"

RPROVIDES:${PN} += "OpenBoard \
config-OpenBoard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libpoppler.so.128 \
libquazip1-qt5.so.1.4.0 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libz.so.1"

inherit rpm
