SUMMARY = "Development files for the Qt5 network library"
DESCRIPTION = "Development files for the Qt5 network library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Network-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "ae019099dce0d2ca4e5f3df0801adde32230ea7bde569364d197d57a4a695fc5487e843a135894cb3ea752b93564bb61f9a78cb8a2fe0036c4dc20bb546aa874"

RPROVIDES:${PN} += "cmake-Qt5Network \
libQt5Network-devel \
pkgconfig-Qt5Network"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Network5 \
pkgconfig-Qt5Core"

inherit rpm
