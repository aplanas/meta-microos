SUMMARY = "Qt5 Quick3D Library"
DESCRIPTION = "Qt Quick 3D is a high level 3D API for Qt Quick. \
Qt Quick 3D enables anyone to introduce 3D content into their Qt Quick \
applications. Rather than requiring the end user to know advanced details of \
the graphicsrendering pipeline (building framegraphs and materials), \
it is now possible to simply build up a 3D scene using high level primitives."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde1"

RPM_NAME = "libQt5Quick3D5-5.15.10+kde1-1.1.aarch64.rpm"
RPM_HASH = "a91e1d73df7a6da92fcb862f80244c7f5f43c7f8022b0336fe64cc8225cfacf940b8def4d37e286cc0cfcc30a3c91fdd2ca45e98e4066a20273086f224d18caa"

RPROVIDES:${PN} += "libQt5Quick3D.so.5 \
libQt5Quick3D5 \
libQt5Quick3DRender.so.5 \
libQt5Quick3DRuntimeRender.so.5 \
libQt5Quick3DUtils.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QmlModels.so.5 \
libQt5Quick.so.5 \
libQt5Quick3DAssetImport.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
