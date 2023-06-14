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

RPROVIDES:${PN} += "mednafen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
