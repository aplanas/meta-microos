SUMMARY = "Development files for the Qt5 GUI library"
DESCRIPTION = "Development files for the Qt5 GUI library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Gui-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "ebddaeb704489250fcd851967c69335b4ee21e6431f1b8fee2b09a2d3742586dd9d40367442a028408d75747847235a22ecc78084395a7177b11327dea3856dd"

RPROVIDES:${PN} += "cmake-Qt5EglFSDeviceIntegration \
cmake-Qt5EglFsKmsSupport \
cmake-Qt5Gui \
cmake-Qt5XcbQpa \
libQt5Gui-devel \
pkgconfig-Qt5Gui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv3-devel \
libQt5Core-devel \
libQt5Gui5 \
pkgconfig-Qt5Core \
pkgconfig-egl \
pkgconfig-gbm \
pkgconfig-glesv2 \
pkgconfig-libdrm \
vulkan-devel"

inherit rpm
