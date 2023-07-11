SUMMARY = "Qt6 Wayland development meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7dca5df676cd9be12da02c37fa734f1884b79a910b0bb486b93e8c017bbe925d7dcaa07159aa9e2496d6a71775c6f090ae72ddaae91114842d4ba6155b39e2b4"

RPROVIDES:${PN} += "qt6-wayland-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandClient \
cmake-Qt6WaylandCompositor \
cmake-Qt6WaylandGlobalPrivate"

inherit rpm
