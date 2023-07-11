SUMMARY = "Generic map viewer: Build Environment"
DESCRIPTION = "Development headers and libraries for Marble."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "marble-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "caec8f125f6de58c558517325d78d8e189c0c5a43bc0d0b36c30b357a8e216691fdcd638d3e237635b1f203773f049d852a2072ed55d7ec4bb611e2deb65419c"

RPROVIDES:${PN} += "cmake-Astro \
cmake-Marble \
marble-devel \
marble5-devel"

RDEPENDS:${PN} += "cmake-Qt5WebEngineWidgets \
cmake-Qt5Widgets \
cmake-Qt5Xml \
libastro1 \
libmarblewidget-qt5-28"

inherit rpm
