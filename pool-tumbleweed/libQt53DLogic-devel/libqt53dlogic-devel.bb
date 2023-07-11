SUMMARY = "Development files for the Qt 5 Logic 3D library"
DESCRIPTION = "Development files for the Qt 5 Logic 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DLogic-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "c8fdd880ce5336675ae844d5240aae20d0dee24d79f9451c2499950cbbd1329fd27801cae5b2364459ad970556073309c7b2aad112237ecdde88cb4dd42a52a6"

RPROVIDES:${PN} += "cmake-Qt53DLogic \
libQt53DLogic-devel \
pkgconfig-Qt53DLogic"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DLogic5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
