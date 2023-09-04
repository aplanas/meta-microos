SUMMARY = "Plugin framework for desktop services: Build Environment"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kservice-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "108225d1a8f1fdca35849e0475c2aafec784fd496b0bdbed874142878fd995b3877bf4cee171e3230e4679bd99ccbb50cbf0b135ccc714e3ddc74e6168335679"

RPROVIDES:${PN} += "cmake-KF5Service \
kservice-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5CoreAddons \
extra-cmake-modules \
kservice"

inherit rpm
