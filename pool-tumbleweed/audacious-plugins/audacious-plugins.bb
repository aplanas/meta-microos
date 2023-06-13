SUMMARY = "Plugins for Audacious"
DESCRIPTION = "Plugins for the Audacious audio player."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-only & MIT"

PV = "4.3"

RPM_NAME = "audacious-plugins-4.3-1.4.aarch64.rpm"
RPM_HASH = "2500f6cf4dd0a586b1029d878a7c1526945eda84227bc3b5f65226f30830f672eb0fc742be2ebf1e3a6db682efe8dcb8a7dff380500c7fcb42e5a1280f24dea0"

RPROVIDES:${PN} += "audacious-plugins \
audacious-plugins(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFLAC.so.12()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libX11.so.6()(64bit) \
libasound.so.2()(64bit) \
libaudcore(aarch-64) \
libaudcore.so.5()(64bit) \
libaudgui.so.5()(64bit) \
libaudqt.so.2()(64bit) \
libaudtag.so.3()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libbs2b.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcddb.so.2()(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libcdio_cdda.so.2()(64bit) \
libcdio_cdda.so.2(CDIO_CDDA_2)(64bit) \
libcue.so.2()(64bit) \
libcurl.so.4()(64bit) \
libfluidsynth.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjack.so.0()(64bit) \
liblirc_client.so.0()(64bit) \
libm.so.6()(64bit) \
libmms.so.0()(64bit) \
libmodplug.so.1()(64bit) \
libmpg123.so.0()(64bit) \
libneon.so.27()(64bit) \
libneon.so.27(NEON_0_29)(64bit) \
libnotify.so.4()(64bit) \
libogg.so.0()(64bit) \
libopenmpt.so.0()(64bit) \
libopusfile.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpipewire-0.3.so.0()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsamplerate.so.0()(64bit) \
libsidplayfp.so.6()(64bit) \
libsndfile.so.1()(64bit) \
libsoxr.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisfile.so.3()(64bit) \
libwavpack.so.1()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
