SUMMARY = "Qt 6 3DRender library"
DESCRIPTION = "The Qt 6 3DRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DRender6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a76693018cbd2c8d77cd558b16a97245a9cc52173b1d0107fbbe980bb3c4bf5df8157fef77c9fd07d8882fb0508300177d47e7e870ea05021157d9e325229bb4"

RPROVIDES:${PN} += "libQt63DRender.so.6()(64bit) \
libQt63DRender.so.6(Qt_6)(64bit) \
libQt63DRender.so.6(Qt_6.0)(64bit) \
libQt63DRender.so.6(Qt_6.1)(64bit) \
libQt63DRender.so.6(Qt_6.2)(64bit) \
libQt63DRender.so.6(Qt_6.3)(64bit) \
libQt63DRender.so.6(Qt_6.4)(64bit) \
libQt63DRender.so.6(Qt_6.5)(64bit) \
libQt63DRender.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt63DRender6 \
libQt63DRender6(aarch-64) \
libassimpsceneimport.so()(64bit) \
libassimpsceneimport.so(Qt_6)(64bit) \
libassimpsceneimport.so(Qt_6.0)(64bit) \
libassimpsceneimport.so(Qt_6.1)(64bit) \
libassimpsceneimport.so(Qt_6.2)(64bit) \
libassimpsceneimport.so(Qt_6.3)(64bit) \
libassimpsceneimport.so(Qt_6.4)(64bit) \
libassimpsceneimport.so(Qt_6.5)(64bit) \
libassimpsceneimport.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libdefaultgeometryloader.so()(64bit) \
libdefaultgeometryloader.so(Qt_6)(64bit) \
libdefaultgeometryloader.so(Qt_6.0)(64bit) \
libdefaultgeometryloader.so(Qt_6.1)(64bit) \
libdefaultgeometryloader.so(Qt_6.2)(64bit) \
libdefaultgeometryloader.so(Qt_6.3)(64bit) \
libdefaultgeometryloader.so(Qt_6.4)(64bit) \
libdefaultgeometryloader.so(Qt_6.5)(64bit) \
libdefaultgeometryloader.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libgltfgeometryloader.so()(64bit) \
libgltfgeometryloader.so(Qt_6)(64bit) \
libgltfgeometryloader.so(Qt_6.0)(64bit) \
libgltfgeometryloader.so(Qt_6.1)(64bit) \
libgltfgeometryloader.so(Qt_6.2)(64bit) \
libgltfgeometryloader.so(Qt_6.3)(64bit) \
libgltfgeometryloader.so(Qt_6.4)(64bit) \
libgltfgeometryloader.so(Qt_6.5)(64bit) \
libgltfgeometryloader.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libgltfsceneexport.so()(64bit) \
libgltfsceneexport.so(Qt_6)(64bit) \
libgltfsceneexport.so(Qt_6.0)(64bit) \
libgltfsceneexport.so(Qt_6.1)(64bit) \
libgltfsceneexport.so(Qt_6.2)(64bit) \
libgltfsceneexport.so(Qt_6.3)(64bit) \
libgltfsceneexport.so(Qt_6.4)(64bit) \
libgltfsceneexport.so(Qt_6.5)(64bit) \
libgltfsceneexport.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libgltfsceneimport.so()(64bit) \
libgltfsceneimport.so(Qt_6)(64bit) \
libgltfsceneimport.so(Qt_6.0)(64bit) \
libgltfsceneimport.so(Qt_6.1)(64bit) \
libgltfsceneimport.so(Qt_6.2)(64bit) \
libgltfsceneimport.so(Qt_6.3)(64bit) \
libgltfsceneimport.so(Qt_6.4)(64bit) \
libgltfsceneimport.so(Qt_6.5)(64bit) \
libgltfsceneimport.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libopenglrenderer.so()(64bit) \
libopenglrenderer.so(Qt_6)(64bit) \
libopenglrenderer.so(Qt_6.0)(64bit) \
libopenglrenderer.so(Qt_6.1)(64bit) \
libopenglrenderer.so(Qt_6.2)(64bit) \
libopenglrenderer.so(Qt_6.3)(64bit) \
libopenglrenderer.so(Qt_6.4)(64bit) \
libopenglrenderer.so(Qt_6.5)(64bit) \
libopenglrenderer.so(Qt_6.5.1_PRIVATE_API)(64bit) \
librhirenderer.so()(64bit) \
librhirenderer.so(Qt_6)(64bit) \
librhirenderer.so(Qt_6.0)(64bit) \
librhirenderer.so(Qt_6.1)(64bit) \
librhirenderer.so(Qt_6.2)(64bit) \
librhirenderer.so(Qt_6.3)(64bit) \
librhirenderer.so(Qt_6.4)(64bit) \
librhirenderer.so(Qt_6.5)(64bit) \
librhirenderer.so(Qt_6.5.1_PRIVATE_API)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt63DAnimation.so.6()(64bit) \
libQt63DAnimation.so.6(Qt_6)(64bit) \
libQt63DCore.so.6()(64bit) \
libQt63DCore.so.6(Qt_6)(64bit) \
libQt63DCore.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt63DExtras.so.6()(64bit) \
libQt63DExtras.so.6(Qt_6)(64bit) \
libQt6Concurrent.so.6()(64bit) \
libQt6Concurrent.so.6(Qt_6)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6ShaderTools.so.6()(64bit) \
libQt6ShaderTools.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libassimp.so.5()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit)"

inherit rpm