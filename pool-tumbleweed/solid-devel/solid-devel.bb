SUMMARY = "KDE Desktop hardware abstraction: Build Environment"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "solid-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "849e257fcd6625ead17067351f05179fb7c0e830e33667f67dfadbc0e311456d58988847dc7414dce94376cae3fccf65dcfbb543bb9f8801bf0b4a616c3ea7f9"

RPROVIDES:${PN} += "cmake-KF5Solid \
solid-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Solid5"

inherit rpm
