SUMMARY = "Sound editor by KDE"
DESCRIPTION = "Kwave is a sound editor by KDE. \
 \
With Kwave you can edit many sorts of wav-files including multi-channel files. \
You are able to alter and play back each channel on its own. Kwave also \
includes many plugins (most are still under development) to transform the \
wave-file in several ways and presents a graphical view with a complete zoom- \
and scroll capability."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kwave-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2fb55b01b502e07709614e32fb974a688e1826b32ca1c10408fc9211b83b961bc6d2a8df6ba4969592feb354e32cf1fef39b6a6a9b61a6461c971c7b0d48ac32"

RPROVIDES:${PN} += "application() \
application(org.kde.kwave.desktop) \
kwave \
kwave(aarch-64) \
libkwave.so.23()(64bit) \
libkwavegui.so.23()(64bit) \
metainfo() \
metainfo(org.kde.kwave.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/x-flac) \
mimehandler(application/x-ogg) \
mimehandler(audio/basic) \
mimehandler(audio/mpeg) \
mimehandler(audio/ogg) \
mimehandler(audio/opus) \
mimehandler(audio/wav) \
mimehandler(audio/x-8svx) \
mimehandler(audio/x-aifc) \
mimehandler(audio/x-aiff) \
mimehandler(audio/x-avr) \
mimehandler(audio/x-caf) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-ircam) \
mimehandler(audio/x-mp1) \
mimehandler(audio/x-mp2) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-nist) \
mimehandler(audio/x-ogg) \
mimehandler(audio/x-smp) \
mimehandler(audio/x-voc) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC++.so.10()(64bit) \
libFLAC.so.12()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libaudiofile.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libid3-3.8.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmad.so.0()(64bit) \
libogg.so.0()(64bit) \
libopus.so.0()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsamplerate.so.0()(64bit) \
libsamplerate.so.0(libsamplerate.so.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit)"

inherit rpm
