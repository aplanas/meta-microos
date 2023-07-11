SUMMARY = "Development files for PLIB, a collection of game libraries"
DESCRIPTION = "Plib contains a selection of libraries that can be helpful for 3D game \
programming. It contains the following libraries: \
* JS - A Joystick interface. \
* PUI - A simple GUI built on top of OpenGL \
* SG - Some Standard Geometry functions \
* SL - A Games-oriented Sound Library \
* SSG - A Simple Scene Graph API built on top of OpenGL"
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.5+svn.2173"

RPM_NAME = "plib-devel-1.8.5+svn.2173-6.9.aarch64.rpm"
RPM_HASH = "3c57238a96761fdc68054f386fd2be4e1ee052ee2c8aa3887ee64ee44410fbf4fb0c17861673db6aa0cf14d2300e8efabaf7cac2e323e5fa5dc5148d39415c65"

RPROVIDES:${PN} += "plib-devel"

RDEPENDS:${PN} += "glibc-devel \
libplib0 \
pkgconfig-gl"

inherit rpm
