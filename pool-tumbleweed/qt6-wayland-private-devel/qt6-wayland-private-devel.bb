SUMMARY = "Qt6 wayland unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-private-devel-6.5.1-1.1.noarch.rpm"
RPM_HASH = "0faf319b043ad2a5e0ce36e137b8821aa850402bdfb88414200c6c650042af3925ba85b43a46e26c0dcc8b49d56ec382d370cbad7fc8627728a0dd5e7075dced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-wayland-private-devel"

RDEPENDS:${PN} += "cmake(Qt6WaylandEglClientHwIntegrationPrivate) \
cmake(Qt6WaylandEglCompositorHwIntegrationPrivate) \
cmake(Qt6WlShellIntegrationPrivate) \
qt6-waylandclient-private-devel \
qt6-waylandcompositor-private-devel"

inherit rpm
