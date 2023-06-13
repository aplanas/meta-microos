SUMMARY = "Software Synthesizer and MIDI Player"
DESCRIPTION = "TiMidity plays MIDI files without external MIDI instruments and \
converts MIDI files to WAV using GUS/patch and SoundFont for voice \
data."
LICENSE = "GPL-2.0-or-later"

PV = "2.15.0"

RPM_NAME = "timidity-2.15.0-3.10.aarch64.rpm"
RPM_HASH = "abc7a8b9c233c7c5cacebaaefe41809948c99180a44170bc43b1c93796363ab79b45b62b8796be64a92e9da2959ab2a64b4e5a10041436597ed20ef3182dcee9"

RPROVIDES:${PN} += "application() \
application(timidity.desktop) \
config(timidity) \
timidity \
timidity(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libao.so.4()(64bit) \
libao.so.4(LIBAO4_1.1.0)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libogg.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libslang.so.2()(64bit) \
libslang.so.2(SLANG2)(64bit) \
libspeex.so.1()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit)"

inherit rpm
