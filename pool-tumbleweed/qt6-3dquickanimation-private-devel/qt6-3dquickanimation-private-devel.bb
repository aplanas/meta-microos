SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickAnimation library"
DESCRIPTION = "This package provides private headers of libQt63DQuickAnimation that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickanimation-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "422e2e1ed490df2516846a211838c759228266a86dcb456d4ec3f24e246f100cd1f13f5560cb9d64d1fd8390a871e2f18bcb0caa1bf393ecc44d01865d734e21"

RPROVIDES:${PN} += "qt6-3dquickanimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickAnimation \
qt6-3dcore-private-devel \
qt6-3dquick-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
