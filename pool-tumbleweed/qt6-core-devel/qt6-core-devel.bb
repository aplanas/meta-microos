SUMMARY = "Development files for the Qt 6 Core library"
DESCRIPTION = "Development files for the Qt 6 Core library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-core-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "d529d435c09c81c98b24ba5ba58769e4af7f579a32494c0ae710e69b50b17cf1735c4919615388a0d228dd1868a9602b937fb50143c9f37e6dd7b619b8bc6176"

RPROVIDES:${PN} += "cmake-Qt6Core \
cmake-Qt6CoreTools \
pkgconfig-Qt6Core \
qt6-core-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Core6 \
pkgconfig-Qt6Platform \
qt6-base-common-devel"

inherit rpm
