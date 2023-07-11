SUMMARY = "Devel files for liblxqt"
DESCRIPTION = "liblxqt represents the core library of LXQt providing essential \
functionality needed by nearly all of its components. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblxqt."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt-devel-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "2b9251f989e5b4b82c4e2bb1a3dfdfde6d053e6ea6600b6240d2f44e24306239a32b37e63a1385d840b2a0c5ab8e64a44c4c02f3ca173b7718a5da3b0cb1a880"

RPROVIDES:${PN} += "cmake-lxqt \
liblxqt-devel \
pkgconfig-lxqt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblxqt1 \
pkgconfig \
pkgconfig-Qt5DBus \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5X11Extras \
pkgconfig-Qt5Xdg \
pkgconfig-Qt5Xml"

inherit rpm
