SUMMARY = "Collection of build features used by qt6-wayland libraries"
DESCRIPTION = "This package contains enabled features information shared by all the \
qt6-wayland libraries."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandglobal-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "849d6f918fa1a258cff57fb0faad88e3937ddd85f18e6ac8e2ffee06b40af1f182a9fba7d11861ddd4123c43d2ba69f60452dcde0bd049f22bae5ff0f682d8d2"

RPROVIDES:${PN} += "cmake-Qt6WaylandGlobalPrivate \
qt6-waylandglobal-private-devel"

RDEPENDS:${PN} += ""

inherit rpm
