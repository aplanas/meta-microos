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

RPROVIDES:${PN} += "config-mpd \
mpd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
group-audio \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libao.so.4 \
libasound.so.2 \
libaudiofile.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavcodec.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libbz2.so.1 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libcdio.so.19 \
libchromaprint.so.1 \
libcurl.so.4 \
libdbus-1.so.3 \
libexpat.so.1 \
libfluidsynth.so.3 \
libfmt.so.9 \
libgcc-s.so.1 \
libgme.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libid3tag.so.0.16.2 \
libiso9660.so.11 \
libixml.so.11 \
libjack.so.0 \
libm.so.6 \
libmad.so.0 \
libmikmod.so.3 \
libmms.so.0 \
libmodplug.so.1 \
libmp3lame.so.0 \
libmpdclient.so.2 \
libmpg123.so.0 \
libnfs.so.14 \
libogg.so.0 \
libopenal.so.1 \
libopenmpt.so.0 \
libopus.so.0 \
libpcre2-8.so.0 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libsamplerate.so.0 \
libshine.so.3 \
libshout.so.3 \
libsmbclient.so.0 \
libsndfile.so.1 \
libsoxr.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libtwolame.so.0 \
libupnp.so.17 \
liburing.so.2 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libwavpack.so.1 \
libyajl.so.2 \
libz.so.1 \
libzzip.so.13 \
shadow \
systemd"

inherit rpm
