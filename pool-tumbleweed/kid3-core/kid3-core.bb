SUMMARY = "Efficient ID3 Tag Editor: Libraries and Data"
DESCRIPTION = "This package contains common libraries and data files used by kid3, kid3-qt, and kid3-cli."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-core-3.9.3-1.4.aarch64.rpm"
RPM_HASH = "d1880bb515468434e903fe4a14fff37f5c664d9b0b8903b3e4183bf3bfadc14f56c2dc2c834f02078be9b4ed0b0a028ae15a02eb7ca58efe2c8d7689945b12e8"

RPROVIDES:${PN} += "config-kid3-core \
kid3-core \
libacoustidimport.so \
libamazonimport.so \
libdiscogsimport.so \
libfreedbimport.so \
libid3libmetadata.so \
libkid3-core.so \
libkid3-gui.so \
libkid3qml.so \
libmusicbrainzimport.so \
liboggflacmetadata.so \
libqmlcommand.so \
libtaglibmetadata.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC++.so.10 \
libFLAC.so.12 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libchromaprint.so.1 \
libgcc-s.so.1 \
libid3-3.8.so.3 \
libm.so.6 \
libogg.so.0 \
libstdc++.so.6 \
libswresample.so.3.9 \
libtag.so.1 \
libvorbis.so.0 \
libvorbisfile.so.3 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2"

inherit rpm
