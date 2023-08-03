SUMMARY = "Development files for the Qt 6 PrintSupport library"
DESCRIPTION = "Development files for the Qt 6 PrintSupport library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-printsupport-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1c0c929e3fea7838c0d3823b8948dbfa1061cdf1ecf91d017c65dccf627044b7c55bccd8bf1ed11cdc8bc39de967cab5203d6122690ca0691524878f0e38252b"

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
