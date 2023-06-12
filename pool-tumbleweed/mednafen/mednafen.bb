SUMMARY = "Multiple video game console emulator"
DESCRIPTION = "Mednafen is a command-line-driven multi-system emulator utilizing \
OpenGL and SDL. Mednafen has the ability to remap hotkey functions \
and virtual system inputs to a keyboard, a joystick, or both \
simultaneously. Save states are supported, as is real-time game \
rewinding. Screen snapshots may be taken, in the PNG file format, at \
the press of a button. Mednafen can record audiovisual movies in the \
QuickTime file format, with several different lossless codecs \
supported. \
 \
Nintendo: NES, FDS, Game Boy (Color|Advance), Super Nintendo, Virtual Boy. \
Sega: Master System, Game Gear, Genesis/MegaDrive, Saturn. \
Nec: TurboGrafx-16/PC Engine (CD), SuperGrafx, PC-FX. \
Sony: PlayStation. \
Apple: II/II+. \
Atari: Lynx. \
SNK: Neo Geo Poket (Color). \
Bandai: Wonderswan (Color)."
LICENSE = "GPL-2.0-only"

PV = "1.31.0"

RPM_NAME = "mednafen-1.31.0-1.4.aarch64.rpm"
RPM_HASH = "6d8a9fdcc0a7689700842d8e45ede9a2a822164ff1985e8e4ff8dab1302e9b2e58b2c08ba415b73dd4cf0815a027ee9c8681bc2d21f1ea5768ac7ff807db4dfc"

RPROVIDES:${PN} += "mednafen \
mednafen(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libz.so.1(ZLIB_1.2.0.2)(64bit) \
libz.so.1(ZLIB_1.2.3.3)(64bit)"

inherit rpm
