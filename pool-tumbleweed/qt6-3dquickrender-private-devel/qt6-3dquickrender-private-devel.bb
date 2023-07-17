SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickRender library"
DESCRIPTION = "This package provides private headers of libQt63DQuickRender that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickrender-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4347281e487455a356e84b95b642d8cb75853c92217775771224fe0ecc11e59081e604802a1f3ce5cd2f51dad5ff1b88ffab0039a5561c5ced27084b48f1b704"

RPROVIDES:${PN} += "qt6-3dquickrender-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickRender \
qt6-3dcore-private-devel \
qt6-3dquick-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
