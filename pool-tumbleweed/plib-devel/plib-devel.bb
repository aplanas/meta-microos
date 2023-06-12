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

RPM_NAME = "plib-devel-1.8.5+svn.2173-6.8.aarch64.rpm"
RPM_HASH = "82f676a52dc083b23536c612e960a71cca617b35faa8db6c0a019909be7fa11c82a37776b8a392e06295d9c1ecc2504b84e65f3ee18d1cc291474fd4843707b4"

RPROVIDES:${PN} += "plib-devel \
plib-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel \
libplib0 \
pkgconfig(gl)"

inherit rpm
