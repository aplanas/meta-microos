SUMMARY = "Software Synthesizer and MIDI Player"
DESCRIPTION = "TiMidity plays MIDI files without external MIDI instruments and \
converts MIDI files to WAV using GUS/patch and SoundFont for voice \
data."
LICENSE = "GPL-2.0-or-later"

PV = "2.15.0"

RPM_NAME = "timidity-2.15.0-3.11.aarch64.rpm"
RPM_HASH = "4a3a6ad8921f3b50a99212a2520f63a3265502c3f7814cacee7f1f444b0f8f25c944415e89c76fcad7d1eb64ea44c17cc225735ca7f2d0adca92c52c2c4d18e8"

RPROVIDES:${PN} += "config-timidity \
timidity"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libX11.so.6 \
libXext.so.6 \
libao.so.4 \
libasound.so.2 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjack.so.0 \
libm.so.6 \
libncurses.so.6 \
libogg.so.0 \
libpng16.so.16 \
libslang.so.2 \
libspeex.so.1 \
libtinfo.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
