SUMMARY = "Qt6 wayland unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-private-devel-6.5.1-1.2.noarch.rpm"
RPM_HASH = "e2562d353946274c08f6bb47c2e971ab31120bf20ed302722037aa21e3a4acf11704ab133573f23f08c944730715cc170ec8e4d9b2ee29eab9940ca3f7a254cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-wayland-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandEglClientHwIntegrationPrivate \
cmake-Qt6WaylandEglCompositorHwIntegrationPrivate \
cmake-Qt6WlShellIntegrationPrivate \
qt6-waylandclient-private-devel \
qt6-waylandcompositor-private-devel"

inherit rpm
