SUMMARY = "Development files for the Qt 6 Widgets library"
DESCRIPTION = "Development files for the Qt 6 Widgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-widgets-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "2a36a2031309c63af803d4d28595bef76f8757c1bc5d075fe40241a3c017aaf52b1f9c6195cbee49b3fcc4bd815ba27931bf1410a8406bcb79639ebcedbb970b"

RPROVIDES:${PN} += "cmake-Qt6Widgets \
cmake-Qt6WidgetsTools \
pkgconfig-Qt6Widgets \
qt6-widgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Gui \
libQt6Widgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
