SUMMARY = "KDE Desktop hardware abstraction: Build Environment"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "solid-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "6b379b32774483d9177f9bcb73c697ee2265e4b45b51c6c6d01ae9cbf839b9d357aa163cdc5b1f3b0ee56a5f37fa0f129b6b000fdc0b3f60d86a73a40ab86b73"

RPROVIDES:${PN} += "cmake-KF5Solid \
solid-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Solid5"

inherit rpm
