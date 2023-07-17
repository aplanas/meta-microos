SUMMARY = "Qt6 BundledEmbree static library"
DESCRIPTION = "The Qt6 BundledEmbree static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-bundledembree-devel-static-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "6c95b57c343cde839d4c880745078e13e023bdd990be4468aac3bcabd736cebb981bb871a71827a6a3b96a135f95e6ac8a8e3940a2d1e9c3a5c1715a8969c7b5"

RPROVIDES:${PN} += "cmake-Qt6BundledEmbree \
qt6-bundledembree-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
