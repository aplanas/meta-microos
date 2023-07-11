SUMMARY = "GTK+ tag editor for audio files"
DESCRIPTION = "EasyTAG is a utility for viewing and editing tags for MP3, MP2, MP4/AAC, FLAC, Ogg Vorbis, \
MusePack, Monkey's Audio and WavPack files. \
 \
Its simple and nice GTK+ interface makes tagging easier."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3"

RPM_NAME = "easytag-2.4.3-7.5.aarch64.rpm"
RPM_HASH = "4296bfcf99031b64e2ae8099db8dde498ce8183f7c0b71a1978ace97f510d2dab79e9bf2fabccb0f32244b9a1253b87fe2bb20eaf01341b680b65648ae6d6fe8"

RPROVIDES:${PN} += "easytag"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libid3-3.8.so.3 \
libid3tag.so.0.16.2 \
libm.so.6 \
libogg.so.0 \
libopus.so.0 \
libopusfile.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libspeex.so.1 \
libstdc++.so.6 \
libtag.so.1 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libwavpack.so.1 \
libz.so.1"

inherit rpm
