SUMMARY = "Sound editor by KDE"
DESCRIPTION = "Kwave is a sound editor by KDE. \
 \
With Kwave you can edit many sorts of wav-files including multi-channel files. \
You are able to alter and play back each channel on its own. Kwave also \
includes many plugins (most are still under development) to transform the \
wave-file in several ways and presents a graphical view with a complete zoom- \
and scroll capability."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kwave-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "2b879464829e60f78a8f5cb23bd9d39782deb132fe7cb1d5123ec202bc2a5673b677166e2513ef0cc1dec71496b9c334a06ad22ffaf78c29a5a6d4e149ddb6ca"

RPROVIDES:${PN} += "kwave \
libkwave.so.23 \
libkwavegui.so.23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC++.so.10 \
libFLAC.so.12 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libasound.so.2 \
libaudiofile.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libid3-3.8.so.3 \
libm.so.6 \
libmad.so.0 \
libogg.so.0 \
libopus.so.0 \
libpulse.so.0 \
libsamplerate.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
