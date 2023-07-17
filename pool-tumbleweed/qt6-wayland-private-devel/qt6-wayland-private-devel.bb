SUMMARY = "Qt6 wayland unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-private-devel-6.5.1-2.1.noarch.rpm"
RPM_HASH = "20aba777eb8f78cd174e3ca08b54f8ccaf078a3c1313c9db7b582ce70d04f4eeb0a3481b55e3553fdd53a4b7cde5d30eede561551f7363229f9e982b1cef59d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-wayland-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandEglClientHwIntegrationPrivate \
cmake-Qt6WaylandEglCompositorHwIntegrationPrivate \
cmake-Qt6WlShellIntegrationPrivate \
qt6-waylandclient-private-devel \
qt6-waylandcompositor-private-devel"

inherit rpm
