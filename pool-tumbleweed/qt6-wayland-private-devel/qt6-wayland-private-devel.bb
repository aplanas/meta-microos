SUMMARY = "Qt6 wayland unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-wayland-private-devel-6.5.2-1.1.noarch.rpm"
RPM_HASH = "f6ade03e5f3093e4f3e88946e2e4e85f7cd2d559757e9d4970f7bf05f8dd90f8e80eb7d36bef6555e2b87c1759cc57c058f01579f5c48b16c64511fd97dc76b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-wayland-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandEglClientHwIntegrationPrivate \
cmake-Qt6WaylandEglCompositorHwIntegrationPrivate \
cmake-Qt6WlShellIntegrationPrivate \
qt6-waylandclient-private-devel \
qt6-waylandcompositor-private-devel"

inherit rpm
