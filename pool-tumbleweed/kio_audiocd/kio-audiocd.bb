SUMMARY = "KDE I/O Slave for Audio CDs"
DESCRIPTION = "This package contains an KIO slave to access audio CDs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kio_audiocd-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "965ccad9052ff08a9a56bf8fbf8713cf51a021d8022ce770241f9ce667803a1a118fb735ead7e97179760f7466046bbfb9bbc6dffc466e37d4291ab6f30c1c65"

RPROVIDES:${PN} += "kio-audiocd \
libaudiocd-encoder-flac.so \
libaudiocd-encoder-lame.so \
libaudiocd-encoder-opus.so \
libaudiocd-encoder-vorbis.so \
libaudiocd-encoder-wav.so \
libaudiocdplugins.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libKF5Cddb.so.5 \
libKF5CompactDisc.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcdda-interface.so.0 \
libcdda-paranoia.so.0 \
libogg.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
