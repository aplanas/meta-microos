SUMMARY = "KDE Desktop hardware abstraction: Build Environment"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "solid-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "4b220e84cbc90f624de748d927346cc8e7b46ad94aa75632667249211fb6ad7defecce072f85164bceb2c11e67d1021eb06dd00da17e29087458c93b4b5f38e3"

RPROVIDES:${PN} += "cmake-KF5Solid \
solid-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Solid5"

inherit rpm
