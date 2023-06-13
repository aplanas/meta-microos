SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The Qt 3D Render module contains functionality to support 2D and 3D \
rendering using Qt 3D."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DRender5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "9257da4a551e7b3a45f18ac707d53bbb9ad57fe17915c739e18a0262cac479406cdc0e2148a37e197fc585692e8b8fe8a1dfd9c28e79d976db0aa40fa13cc962"

RPROVIDES:${PN} += "libQt53DRender.so.5()(64bit) \
libQt53DRender.so.5(Qt_5)(64bit) \
libQt53DRender.so.5(Qt_5.0)(64bit) \
libQt53DRender.so.5(Qt_5.1)(64bit) \
libQt53DRender.so.5(Qt_5.10)(64bit) \
libQt53DRender.so.5(Qt_5.11)(64bit) \
libQt53DRender.so.5(Qt_5.12)(64bit) \
libQt53DRender.so.5(Qt_5.13)(64bit) \
libQt53DRender.so.5(Qt_5.14)(64bit) \
libQt53DRender.so.5(Qt_5.15)(64bit) \
libQt53DRender.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt53DRender.so.5(Qt_5.2)(64bit) \
libQt53DRender.so.5(Qt_5.3)(64bit) \
libQt53DRender.so.5(Qt_5.4)(64bit) \
libQt53DRender.so.5(Qt_5.5)(64bit) \
libQt53DRender.so.5(Qt_5.6)(64bit) \
libQt53DRender.so.5(Qt_5.7)(64bit) \
libQt53DRender.so.5(Qt_5.8)(64bit) \
libQt53DRender.so.5(Qt_5.9)(64bit) \
libQt53DRender5 \
libQt53DRender5(aarch-64) \
libQt53DRenderer5 \
libassimpsceneimport.so()(64bit) \
libdefaultgeometryloader.so()(64bit) \
libgltfgeometryloader.so()(64bit) \
libgltfsceneexport.so()(64bit) \
libgltfsceneimport.so()(64bit) \
libopenglrenderer.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt53DAnimation.so.5()(64bit) \
libQt53DAnimation.so.5(Qt_5)(64bit) \
libQt53DCore.so.5()(64bit) \
libQt53DCore.so.5(Qt_5)(64bit) \
libQt53DCore.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt53DExtras.so.5()(64bit) \
libQt53DExtras.so.5(Qt_5)(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core5 \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libassimp.so.5()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
