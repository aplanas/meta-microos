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

RPM_NAME = "omnispeak-1.1+git20230213-1.2.aarch64.rpm"
RPM_HASH = "f6f92d5afd4ba257068ffb670e1c51a9f380152a07c3d6d90514a2363cd485cc6f0e50b3d3f5c22ef44da05bc307033fee0d45795835e22064830630cc6fe9af"

RPROVIDES:${PN} += "omnispeak"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
