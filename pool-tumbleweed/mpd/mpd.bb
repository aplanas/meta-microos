SUMMARY = "Music Player Daemon"
DESCRIPTION = "A daemon for playing music (mp3, ogg vorbis, flac, and wav).  Music is \
played through the server's audio device.  The daemon stores info \
about all available music, and this info can be easily searched and \
retrieved.  Player control, info retrieval, and playlist management \
can all be managed remotely. There a bunch of clients to control mpd: \
for Gnome, KDE, console and Apache (PHP). \
 \
Please read README.mpd how to configure it."
LICENSE = "GPL-2.0-or-later"

PV = "0.23.13"

RPM_NAME = "mpd-0.23.13-1.2.aarch64.rpm"
RPM_HASH = "796e81265984a3824ad84a5d7db3b6ab760438e27c8ae3d87dac221300d8b52af4cc5477eaacd3a43c5caf2f47a79af9e5e82d436a9baf41688bfed5a10860c9"

RPROVIDES:${PN} += "config(mpd) \
mpd \
mpd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
group(audio) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libao.so.4()(64bit) \
libao.so.4(LIBAO4_1.1.0)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libaudiofile.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavfilter.so.9()(64bit) \
libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libcdio_cdda.so.2()(64bit) \
libcdio_cdda.so.2(CDIO_CDDA_2)(64bit) \
libcdio_paranoia.so.2()(64bit) \
libcdio_paranoia.so.2(CDIO_PARANOIA_2)(64bit) \
libchromaprint.so.1()(64bit) \
libcurl.so.4()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libexpat.so.1()(64bit) \
libfluidsynth.so.3()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgme.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libid3tag.so.0.16.2()(64bit) \
libiso9660.so.11()(64bit) \
libiso9660.so.11(ISO9660_11)(64bit) \
libixml.so.11()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmad.so.0()(64bit) \
libmikmod.so.3()(64bit) \
libmms.so.0()(64bit) \
libmodplug.so.1()(64bit) \
libmp3lame.so.0()(64bit) \
libmpdclient.so.2()(64bit) \
libmpdclient.so.2(libmpdclient2)(64bit) \
libmpg123.so.0()(64bit) \
libnfs.so.14()(64bit) \
libogg.so.0()(64bit) \
libopenal.so.1()(64bit) \
libopenmpt.so.0()(64bit) \
libopus.so.0()(64bit) \
libpcre2-8.so.0()(64bit) \
libpipewire-0.3.so.0()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsamplerate.so.0()(64bit) \
libsamplerate.so.0(libsamplerate.so.0.0)(64bit) \
libshine.so.3()(64bit) \
libshout.so.3()(64bit) \
libsmbclient.so.0()(64bit) \
libsmbclient.so.0(SMBCLIENT_0.1.0)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libsoxr.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtwolame.so.0()(64bit) \
libupnp.so.17()(64bit) \
liburing.so.2()(64bit) \
liburing.so.2(LIBURING_2.0)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libwavpack.so.1()(64bit) \
libyajl.so.2()(64bit) \
libz.so.1()(64bit) \
libzzip.so.13()(64bit) \
shadow \
systemd"

inherit rpm