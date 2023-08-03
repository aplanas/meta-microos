SUMMARY = "Collection of build features used by qt6-wayland libraries"
DESCRIPTION = "This package contains enabled features information shared by all the \
qt6-wayland libraries."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-waylandglobal-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "60e0955e509a64db797db770c960f44e0239e9f5ea27b195394f892f8720d617a7031d7f60ea654ec9e923e8398a0d1dec2ef36308df8731013f2c98f07b7c54"

RPROVIDES:${PN} += "cmake-Qt6WaylandGlobalPrivate \
qt6-waylandglobal-private-devel"

RDEPENDS:${PN} += ""

inherit rpm
