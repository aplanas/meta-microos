SUMMARY = "Qt6 Wayland development meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "3a56afa212ce199ce368f6dcd920e3ca91484c83039e935b095bcfc2f577143693fcbe38f7410080cf084adc50344280d68f01370f2f1603ce1ccfacdc982d07"

RPROVIDES:${PN} += "qt6-wayland-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandClient \
cmake-Qt6WaylandCompositor \
cmake-Qt6WaylandGlobalPrivate"

inherit rpm
