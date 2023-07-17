SUMMARY = "Development files for the Qt 6 PrintSupport library"
DESCRIPTION = "Development files for the Qt 6 PrintSupport library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-printsupport-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "8c191d32daf5c8a34d952176c5afb55b0ed3529dfda94427100a2a265a27e15d0364db1f0876401f9cde38ab7c96768ed7b295d345571def008f0f6c7ff45d98"

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
