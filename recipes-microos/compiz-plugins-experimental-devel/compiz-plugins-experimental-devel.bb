SUMMARY = "OpenGL window and compositing manager community plugins"
DESCRIPTION = "This package contains the community unsupported Compiz compositing \
manager plugins. \
 \
This package contain development files required for developing \
other plugins."
LICENSE = "GPL-2.0-or-later & GPL-2.0-only"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-experimental-devel-0.8.18-1.16.aarch64.rpm"
RPM_HASH = "682ea18dd369f74c657c77518984e5287d5517feac82ff30757c0dd8eaae48e56c1a12662ddce228be622a55a89608490a5ac8e8c86a8a77895237bd2bf6c4cb"

RPROVIDES:${PN} += "compiz-plugins-experimental-devel compiz-plugins-experimental-devel(aarch-64)"
RDEPENDS:${PN} += "compiz-plugins-experimental pkgconfig(bcop) pkgconfig(compiz) pkgconfig(gl)"

inherit rpm
