SUMMARY = "A Python Module for Interfacing with the SDL Multimedia Library"
DESCRIPTION = "Pygame is a Python wrapper module for the SDL multimedia library. It \
contains Python functions and classes that allow you to use SDL's \
support for playing CD-ROMs, audio and video output, and keyboard, \
mouse and joystick input. Pygame also includes support for the \
Numerical Python extension. Pygame is the successor to the pySDL \
wrapper project, written by Mark Baker."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "python310-pygame-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "0f6d301ef6f3416e11470c20cbcea40c998a534052556ef99d9cb65f17f46189f7e1b79c7d7a24dd9e8ba9bb4122a6a04ca51848fe048819770cc890acb089bf"

RPROVIDES:${PN} += "python3.10dist-pygame \
python310-pygame \
python3dist-pygame"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.10 \
fontconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
libpng16.so.16 \
libportmidi.so.2 \
python-abi \
python310-numpy"

inherit rpm
