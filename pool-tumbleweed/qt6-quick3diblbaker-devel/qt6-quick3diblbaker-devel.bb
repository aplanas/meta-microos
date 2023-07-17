SUMMARY = "Qt6 Quick3DIblBaker library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3diblbaker-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c2120bc924d4c23fc8dbefa8a1487a2704ea8a37e7eae1e7ccbe42ff1816b454b2da2e014ffe7c015da341a28a6090ee009a57f5dcf883a9f96b9d7f7e6ae2fc"

RPROVIDES:${PN} += "cmake-Qt6Quick3DIblBaker \
pkgconfig-Qt6Quick3DIblBaker \
qt6-quick3diblbaker-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Quick \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3DIblBaker6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3DRuntimeRender"

inherit rpm
