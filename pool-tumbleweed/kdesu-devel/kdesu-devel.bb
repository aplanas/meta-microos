SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kdesu-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "310ef1dab00ceae10f8dc5b0c1640b01928b048b2ff841669b206dde61e422a18710622375ab5e3659e2cdef0be3c536689668c647684f857f94319127c49af9"

RPROVIDES:${PN} += "cmake-KF5Su \
kdesu-devel"

RDEPENDS:${PN} += "cmake-KF5Pty \
cmake-KF5Service \
extra-cmake-modules \
libKF5Su5"

inherit rpm
