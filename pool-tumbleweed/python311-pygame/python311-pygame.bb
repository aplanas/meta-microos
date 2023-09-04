SUMMARY = "A Python Module for Interfacing with the SDL Multimedia Library"
DESCRIPTION = "Pygame is a Python wrapper module for the SDL multimedia library. It \
contains Python functions and classes that allow you to use SDL's \
support for playing CD-ROMs, audio and video output, and keyboard, \
mouse and joystick input. Pygame also includes support for the \
Numerical Python extension. Pygame is the successor to the pySDL \
wrapper project, written by Mark Baker."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "python311-pygame-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "f32d95ba306ce9e16266d01c093ee542b33cc680c50542fe0bd210ba1ee6ba23f4661f82918d3e72c3a750617cba0c1c6569a4a1bd22c77748b90b69f15fd829"

RPROVIDES:${PN} += "python3-pygame \
python3.11dist-pygame \
python311-pygame \
python3dist-pygame"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
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
python311-numpy"

inherit rpm
