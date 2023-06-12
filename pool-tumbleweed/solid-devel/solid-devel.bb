SUMMARY = "KDE Desktop hardware abstraction: Build Environment"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "solid-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "7af291148ce2f043db76b7c4a4f41cbe9fba4b0f04c97bc88910525105a72077e32c6ca0453c9ec7d2b8cce203abc5fbe24a8476db1d09e2ed3f31583285ac97"

RPROVIDES:${PN} += "cmake(KF5Solid) \
solid-devel \
solid-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) \
extra-cmake-modules \
libKF5Solid5"

inherit rpm
