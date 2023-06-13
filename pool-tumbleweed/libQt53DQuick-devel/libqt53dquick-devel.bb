SUMMARY = "Development files for the Qt 5 Quick 3D library"
DESCRIPTION = "Development files for the Qt 5 Quick 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuick-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "128cbcda4cac87a880dfbf301d2487ec073e89b47cddb7eccc52cf9ff6c8f512d63732e02b3199c2786b4190497333d9a6f587e1ebd8aaafbe00c13ee3adb584"

RPROVIDES:${PN} += "cmake(Qt53DQuick) \
libQt53DQuick-devel \
libQt53DQuick-devel(aarch-64) \
pkgconfig(Qt53DQuick)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuick5 \
pkgconfig(Qt53DCore) \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Qml) \
pkgconfig(Qt5Quick)"

inherit rpm
