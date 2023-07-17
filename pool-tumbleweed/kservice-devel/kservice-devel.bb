SUMMARY = "Plugin framework for desktop services: Build Environment"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kservice-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "eab191efc54fa4bd66b752e7bb92704cc3781549da0224bf98c161e5c672d06fa207cf2e9460485c204ba4a17166fb88a6113b72f3748223de94ae0e0f491c2f"

RPROVIDES:${PN} += "cmake-KF5Service \
kservice-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5CoreAddons \
extra-cmake-modules \
kservice"

inherit rpm
