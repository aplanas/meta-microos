SUMMARY = "Software Synthesizer and MIDI Player"
DESCRIPTION = "TiMidity plays MIDI files without external MIDI instruments and \
converts MIDI files to WAV using GUS/patch and SoundFont for voice \
data."
LICENSE = "GPL-2.0-or-later"

PV = "2.15.0"

RPM_NAME = "timidity-2.15.0-3.10.aarch64.rpm"
RPM_HASH = "abc7a8b9c233c7c5cacebaaefe41809948c99180a44170bc43b1c93796363ab79b45b62b8796be64a92e9da2959ab2a64b4e5a10041436597ed20ef3182dcee9"

RPROVIDES:${PN} += "config-timidity \
timidity"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
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
