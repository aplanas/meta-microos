SUMMARY = "An reimplementation of 'Commander Keen in Goodbye Galaxy!'"
DESCRIPTION = "Omnispeak is an open-source reimplementation of Commander Keen \
episodes 4, 5, and 6. It aims to be a pixel-perfect, bug-for-bug \
clone of the original games, and is compatible with savegames \
from the DOS version. \
 \
Omnispeak also includes several new features, including: \
 * Improved graphics scaling and compatibility support. \
 * Dramatically improved joystick/gamepad support. \
 * QuickLoad and QuickSave support (F5 and F9 by default) \
 * Support for real AdLib / OPL2 compatible sound cards \
 * Support for the OPL2LPT \
 \
NOTE: \
To play the Commander Keen games with omnispeak you need the \
original game files! \
 \
Run \
 * omnispeak-keen4 \
 * omnispeak-keen5 \
 * omnispeak-keen6 \
from the directory where the original game files are located."
LICENSE = "GPL-2.0-only"

PV = "1.1+git20230213"

RPM_NAME = "omnispeak-1.1+git20230213-1.1.aarch64.rpm"
RPM_HASH = "691a6935a893fc837d0b31aa6e57de58ea0cfc3edcdd5639004e584bb60bc4b93d3f45d0a2d35c775d0a130b9c793b4ca935fde8df116d34033705f8eb7d89d1"

RPROVIDES:${PN} += "omnispeak"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
