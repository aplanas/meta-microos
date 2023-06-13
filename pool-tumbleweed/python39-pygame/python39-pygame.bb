SUMMARY = "A Python Module for Interfacing with the SDL Multimedia Library"
DESCRIPTION = "Pygame is a Python wrapper module for the SDL multimedia library. It \
contains Python functions and classes that allow you to use SDL's \
support for playing CD-ROMs, audio and video output, and keyboard, \
mouse and joystick input. Pygame also includes support for the \
Numerical Python extension. Pygame is the successor to the pySDL \
wrapper project, written by Mark Baker."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python39-pygame-2.1.3-2.1.aarch64.rpm"
RPM_HASH = "397ff90ed8bb492d1aedc8bc347e2b4bab54010b588081a23e60fa90b6c95e907efa901b684d05fc1125b14de86b659535133a09feedb5edb141823aaf540875"

RPROVIDES:${PN} += "python3.9dist(pygame) \
python39-pygame \
python39-pygame(aarch-64) \
python3dist(pygame)"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.9 \
fontconfig \
ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libportmidi.so.2()(64bit) \
python(abi) \
python39-numpy"

inherit rpm
