SUMMARY = "Development files for the Qt 6 Core library"
DESCRIPTION = "Development files for the Qt 6 Core library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-core-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "b6a53eacc734ec5aa7d72ce8ae2abd7e94b8066539cc11803517c46f31518249f0a76e7589702c3d58f1b36422c18b234118bf2341c74671bd868a445163dc5d"

RPROVIDES:${PN} += "cmake-Qt6Core \
cmake-Qt6CoreTools \
pkgconfig-Qt6Core \
qt6-core-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Core6 \
pkgconfig-Qt6Platform \
qt6-base-common-devel"

inherit rpm
