SUMMARY = "KDE I/O Slave for Audio CDs"
DESCRIPTION = "This package contains an KIO slave to access audio CDs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kio_audiocd-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "30f1a3e8f2d8386f06f03d95dd56bdc8da606acde7a7bd0989890a373a1cfb5f0e5acf239acbdbe464bf059aaa988113d23243dfb486a079a42e4d27b12698c3"

RPROVIDES:${PN} += "application() \
application(kcm_audiocd.desktop) \
kio_audiocd \
kio_audiocd(aarch-64) \
libaudiocd_encoder_flac.so()(64bit) \
libaudiocd_encoder_lame.so()(64bit) \
libaudiocd_encoder_opus.so()(64bit) \
libaudiocd_encoder_vorbis.so()(64bit) \
libaudiocd_encoder_wav.so()(64bit) \
libaudiocdplugins.so.5()(64bit) \
metainfo() \
metainfo(org.kde.kio_audiocd.metainfo.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libKF5Cddb.so.5()(64bit) \
libKF5CompactDisc.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdda_interface.so.0()(64bit) \
libcdda_paranoia.so.0()(64bit) \
libogg.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit)"

inherit rpm
