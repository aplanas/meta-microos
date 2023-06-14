SUMMARY = "Development files for the Qt5 network library"
DESCRIPTION = "Development files for the Qt5 network library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Network-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "e3072bb38854172b30e6681174c6239e49d8c460dcdf1842ad87189e1b43c83f32632ed98891846a471b782149b8b49d852ce0991c709e202a9a5816cf681bab"

RPROVIDES:${PN} += "cmake-Qt5Network \
libQt5Network-devel \
pkgconfig-Qt5Network"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Network5 \
pkgconfig-Qt5Core"

inherit rpm
