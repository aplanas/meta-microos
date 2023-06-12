SUMMARY = "Devel files for liblxqt"
DESCRIPTION = "liblxqt represents the core library of LXQt providing essential \
functionality needed by nearly all of its components. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblxqt."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt-devel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "5bad3103b810de7d01f086e5d80916dd04f1b71c6261053bc28ba13c5cdbabd43ef0be33aa97895cc04b590a89ae8437490a4f04c57463267d5192b9be494f01"

RPROVIDES:${PN} += "cmake(lxqt) \
liblxqt-devel \
liblxqt-devel(aarch-64) \
pkgconfig(lxqt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblxqt1 \
pkgconfig \
pkgconfig(Qt5DBus) \
pkgconfig(Qt5Widgets) \
pkgconfig(Qt5X11Extras) \
pkgconfig(Qt5Xdg) \
pkgconfig(Qt5Xml)"

inherit rpm
