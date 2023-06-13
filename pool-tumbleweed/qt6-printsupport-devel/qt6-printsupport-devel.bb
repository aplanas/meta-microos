SUMMARY = "Development files for the Qt 6 PrintSupport library"
DESCRIPTION = "Development files for the Qt 6 PrintSupport library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-printsupport-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b6a720eba78d7d31b30118533a041a789b1b179493c64bac69406bd4e0bd7c44a2b03681fbd726b1f9c414d566168055e4ad0bf73314d7c6064c396790921383"

RPROVIDES:${PN} += "cmake(Qt6PrintSupport) \
pkgconfig(Qt6PrintSupport) \
qt6-printsupport-devel \
qt6-printsupport-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Core) \
cmake(Qt6Gui) \
cmake(Qt6Widgets) \
libQt6PrintSupport6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Widgets)"

inherit rpm
