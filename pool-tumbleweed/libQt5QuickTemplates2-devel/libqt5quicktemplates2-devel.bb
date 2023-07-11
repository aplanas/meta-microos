SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with qtquickcontrols2."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde6"

RPM_NAME = "libQt5QuickTemplates2-devel-5.15.10+kde6-1.1.aarch64.rpm"
RPM_HASH = "0ba5e28147a198eaa24c6a19518d3a8eaa2b9662a4dea79932ccd478f4ef7abe2c5864db9570271f1afa92ccf7d762f668e4119fdd8691f7f282057ba818b144"

RPROVIDES:${PN} += "cmake-Qt5QuickTemplates2 \
libQt5QuickTemplates2-devel \
pkgconfig-Qt5QuickTemplates2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5QuickTemplates2-5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5QmlModels \
pkgconfig-Qt5Quick"

inherit rpm
