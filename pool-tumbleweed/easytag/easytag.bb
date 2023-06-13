SUMMARY = "GTK+ tag editor for audio files"
DESCRIPTION = "EasyTAG is a utility for viewing and editing tags for MP3, MP2, MP4/AAC, FLAC, Ogg Vorbis, \
MusePack, Monkey's Audio and WavPack files. \
 \
Its simple and nice GTK+ interface makes tagging easier."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3"

RPM_NAME = "easytag-2.4.3-7.4.aarch64.rpm"
RPM_HASH = "0788442082e64155d0444c74a8cca262e3b908e78d2299c9efba17e1fb6d8bcb0e015b046c2ed16bc9b47b7d0897f33e5ac4f4130968bb13ed0ea6b763e444bb"

RPROVIDES:${PN} += "application() \
application(easytag.desktop) \
easytag \
easytag(aarch-64) \
metainfo() \
metainfo(easytag.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(audio/mpeg) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-opus+ogg) \
mimehandler(audio/x-speex+ogg) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(inode/directory)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libid3-3.8.so.3()(64bit) \
libid3tag.so.0.16.2()(64bit) \
libm.so.6()(64bit) \
libogg.so.0()(64bit) \
libopus.so.0()(64bit) \
libopusfile.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libspeex.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libtag.so.1()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisfile.so.3()(64bit) \
libwavpack.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
