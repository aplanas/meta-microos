SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-devel-0.6.0-44.24.aarch64.rpm"
RPM_HASH = "f6751cf6b8fead751ee3519dea54ede99f278fa78931155eecc6cddaa9a4672e1e26cc8b8ae23c97f9c5343c0c2dfb0b208812c200288877459291cee328c27c"

RPROVIDES:${PN} += "pkgconfig(tomoe-gtk) \
tomoe-gtk-devel \
tomoe-gtk-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gucharmap-devel \
pkgconfig(gtk+-2.0) \
pkgconfig(tomoe) \
tomoe-devel \
tomoe-gtk"

inherit rpm
