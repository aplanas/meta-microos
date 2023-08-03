SUMMARY = "Development files for the Qt 6 Core library"
DESCRIPTION = "Development files for the Qt 6 Core library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-core-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "72092acab6685e6d27576a188182b46a3ff247a13e140d24104af320f931c80ff64c3639ccacffef9fe22e6a339601b9acddec3d8902cba8fba6db7c6e176a84"

RPROVIDES:${PN} += "cmake-Qt6Core \
cmake-Qt6CoreTools \
pkgconfig-Qt6Core \
qt6-core-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Core6 \
pkgconfig-Qt6Platform \
qt6-base-common-devel"

inherit rpm
