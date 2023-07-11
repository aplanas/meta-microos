SUMMARY = "Development files for the Qt 6 PrintSupport library"
DESCRIPTION = "Development files for the Qt 6 PrintSupport library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-printsupport-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "c0ae224f453b72c9751444766d085754ac7882fc70cd7128dd641a22a3f56a04fff7d901da7b463cedd2ebaf043f81a0cdc53e1aca4a3c212ba412d3db0c74f2"

RPROVIDES:${PN} += "cmake-Qt6PrintSupport \
pkgconfig-Qt6PrintSupport \
qt6-printsupport-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Widgets \
libQt6PrintSupport6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Widgets"

inherit rpm
