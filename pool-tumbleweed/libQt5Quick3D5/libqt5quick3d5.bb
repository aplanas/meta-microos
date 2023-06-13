SUMMARY = "Qt5 Quick3D Library"
DESCRIPTION = "Qt Quick 3D is a high level 3D API for Qt Quick. \
Qt Quick 3D enables anyone to introduce 3D content into their Qt Quick \
applications. Rather than requiring the end user to know advanced details of \
the graphicsrendering pipeline (building framegraphs and materials), \
it is now possible to simply build up a 3D scene using high level primitives."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde1"

RPM_NAME = "libQt5Quick3D5-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "4225e3e0a892ab2dd626ecba49be868bdb5dd755ef2a517d7ec83ae82e54d324822317c29b3f365906b9ad68d6d0bd29ea00841a7fc444a9188a365c4be39508"

RPROVIDES:${PN} += "libQt5Quick3D.so.5()(64bit) \
libQt5Quick3D.so.5(Qt_5)(64bit) \
libQt5Quick3D5 \
libQt5Quick3D5(aarch-64) \
libQt5Quick3DRender.so.5()(64bit) \
libQt5Quick3DRender.so.5(Qt_5)(64bit) \
libQt5Quick3DRuntimeRender.so.5()(64bit) \
libQt5Quick3DRuntimeRender.so.5(Qt_5)(64bit) \
libQt5Quick3DUtils.so.5()(64bit) \
libQt5Quick3DUtils.so.5(Qt_5)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5QmlModels.so.5()(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Quick3DAssetImport.so.5()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
