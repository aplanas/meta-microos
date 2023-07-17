SUMMARY = "Development files for the Qt5 GUI library"
DESCRIPTION = "Development files for the Qt5 GUI library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Gui-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "84a880d3ee6b8d9c4b1cdbbc4f1066241af9b6df26782c280c265d135947ab574382660c8bb2979c4d34f2b6b7ca6b587cbb4f93abf8d723307490e65813249a"

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
