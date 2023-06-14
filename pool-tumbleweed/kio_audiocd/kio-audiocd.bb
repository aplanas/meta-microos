SUMMARY = "KDE I/O Slave for Audio CDs"
DESCRIPTION = "This package contains an KIO slave to access audio CDs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kio_audiocd-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "30f1a3e8f2d8386f06f03d95dd56bdc8da606acde7a7bd0989890a373a1cfb5f0e5acf239acbdbe464bf059aaa988113d23243dfb486a079a42e4d27b12698c3"

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
