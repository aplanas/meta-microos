SUMMARY = "Qt6 Quick3DRuntimeRender library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3druntimerender-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "82dba29648f0797283163acbbbdc24865fd16d65c4451b885c7f621601a640bd137cc5c920affd4e03038da26955a834b2bed91536498b3917b64524aad397fa"

RPROVIDES:${PN} += "cmake-Qt6Quick3DRuntimeRender \
pkgconfig-Qt6Quick3DRuntimeRender \
qt6-quick3druntimerender-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Concurrent \
cmake-Qt6Gui \
cmake-Qt6Quick \
cmake-Qt6Quick3DUtils \
cmake-Qt6ShaderTools \
libQt6Quick3DRuntimeRender6 \
pkgconfig-Qt6Concurrent \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3DUtils \
pkgconfig-Qt6ShaderTools"

inherit rpm
