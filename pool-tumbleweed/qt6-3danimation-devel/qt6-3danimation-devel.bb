SUMMARY = "Development files for the Qt 6 3DAnimation library"
DESCRIPTION = "Development files for the Qt 6 3DAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3danimation-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9102fe2fc378c2504054fb052b280f996f7339d32df7941295f60ecfd0b076678b4135d21739b602d60266725b7c11e0324f5655b9f820246a4b6a191a69b345"

RPROVIDES:${PN} += "cmake(Qt63DAnimation) \
pkgconfig(Qt63DAnimation) \
qt6-3danimation-devel \
qt6-3danimation-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt63DCore) \
cmake(Qt63DRender) \
cmake(Qt6Gui) \
libQt63DAnimation6 \
pkgconfig(Qt63DCore) \
pkgconfig(Qt63DRender) \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui)"

inherit rpm
