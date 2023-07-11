SUMMARY = "Collection of build features used by qt6-wayland libraries"
DESCRIPTION = "This package contains enabled features information shared by all the \
qt6-wayland libraries."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandglobal-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "37eec68a1e34a7e7d3ed4d7d6e1759fb29c8d5fe810e7221ac97319613f5cbd31814d1650ba364e3d9aca1e2101d95b023ac9ebcd3556f842603c550d588fa16"

RPROVIDES:${PN} += "cmake-Qt6WaylandGlobalPrivate \
qt6-waylandglobal-private-devel"

RDEPENDS:${PN} += ""

inherit rpm
