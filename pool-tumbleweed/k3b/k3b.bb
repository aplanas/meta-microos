SUMMARY = "CD/DVD/Blu-ray Burning Application by KDE"
DESCRIPTION = "Featuring a graphical interface, k3b provides various \
options for burning a CD, DVD, or BD (Blu-ray disc). Various types of \
projects are supported, including audio and data, video \
projects for DVD and VCD, as well as multi-session and mixed-mode discs. k3b \
has the ability to erase re-writeable media, and can perform more \
complicated tasks such as audiovisual encoding and decoding."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "k3b-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "2d21455df9b50a34d5c81404a104576f0d014534ad470758f2654329772566a69c67ce14d65960b476cf986b82690713b197d3d993a448a694365a17e6de5f6b"

RPROVIDES:${PN} += "k3b \
kde4-k3b \
libk3bdevice.so.8 \
libk3blib.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/cdrdao \
/usr/bin/cdrecord \
/usr/bin/mkisofs \
/usr/bin/readcd \
dvd+rw-tools \
hicolor-icon-theme \
lame \
ld-linux-aarch64.so.1 \
libFLAC++.so.10 \
libKF5Archive.so.5 \
libKF5Bookmarks.so.5 \
libKF5Cddb.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libdvdread.so.8 \
libm.so.6 \
libmad.so.0 \
libmp3lame.so.0 \
libmpcdec.so.6 \
libogg.so.0 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libtag.so.1 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3 \
shared-mime-info"

inherit rpm
