SUMMARY = "A Python Module for Interfacing with the SDL Multimedia Library"
DESCRIPTION = "Pygame is a Python wrapper module for the SDL multimedia library. It \
contains Python functions and classes that allow you to use SDL's \
support for playing CD-ROMs, audio and video output, and keyboard, \
mouse and joystick input. Pygame also includes support for the \
Numerical Python extension. Pygame is the successor to the pySDL \
wrapper project, written by Mark Baker."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "python39-pygame-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "0c06f7b5d96af424c04fd7fe9f2adb9d5392ef418d725dfb3628821454ec4554b1c200d684bb190fa17b2c4a16d90b24058ca159977f4f95cb0893649756a3be"

RPROVIDES:${PN} += "python3.9dist-pygame \
python39-pygame \
python3dist-pygame"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.9 \
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
python39-numpy"

inherit rpm
