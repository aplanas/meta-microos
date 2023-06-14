SUMMARY = "Plugins for Audacious"
DESCRIPTION = "Plugins for the Audacious audio player."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-only & MIT"

PV = "4.3"

RPM_NAME = "audacious-plugins-4.3-1.4.aarch64.rpm"
RPM_HASH = "2500f6cf4dd0a586b1029d878a7c1526945eda84227bc3b5f65226f30830f672eb0fc742be2ebf1e3a6db682efe8dcb8a7dff380500c7fcb42e5a1280f24dea0"

RPROVIDES:${PN} += "audacious-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libasound.so.2 \
libaudcore \
libaudcore.so.5 \
libaudgui.so.5 \
libaudqt.so.2 \
libaudtag.so.3 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libbs2b.so.0 \
libc.so.6 \
libcairo.so.2 \
libcddb.so.2 \
libcdio-cdda.so.2 \
libcdio.so.19 \
libcue.so.2 \
libcurl.so.4 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjack.so.0 \
liblirc-client.so.0 \
libm.so.6 \
libmms.so.0 \
libmodplug.so.1 \
libmpg123.so.0 \
libneon.so.27 \
libnotify.so.4 \
libogg.so.0 \
libopenmpt.so.0 \
libopusfile.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libsamplerate.so.0 \
libsidplayfp.so.6 \
libsndfile.so.1 \
libsoxr.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libwavpack.so.1 \
libxml2.so.2 \
libz.so.1"

inherit rpm
