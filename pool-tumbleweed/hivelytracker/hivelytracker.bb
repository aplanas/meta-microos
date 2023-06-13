SUMMARY = "Music tracker for AHX and HVL formats"
DESCRIPTION = "Hively Tracker is a tracker program based upon the AHX format created \
in the mid '90s by Dexter and Pink of Abyss. The format was relatively \
popular, and many songs were created and used in scene productions and \
games. AHX was designed to create a very SID-like sound on the Amiga. \
 \
HivelyTracker can import and export modules and instruments in the AHX \
format, but it also improves on AHX in several ways and therefore has \
its own instrument and module formats. \
 \
HivelyTracker offers the following features over AHX: \
 * Multichannel (4 to 16 channels) \
 * Per-channel stereo panning \
 * Two commands per note instead of one \
 * Ring modulation \
 * A more feature rich editor"
LICENSE = "BSD-3-Clause"

PV = "1.9"

RPM_NAME = "hivelytracker-1.9-1.2.aarch64.rpm"
RPM_HASH = "ad070605cabd05f3e01b26fac5be5a7e97cba302db5e9fa7f30658db3d56054f39cd067c677d4a1145494adb3a1869c3f2cd8c8f9af990a0a3aac4eab3ea18c0"

RPROVIDES:${PN} += "application() \
application(hivelytracker.desktop) \
hivelytracker \
hivelytracker(aarch-64)"

RDEPENDS:${PN} += "libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_ttf-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
texlive-dejavu-fonts"

inherit rpm
