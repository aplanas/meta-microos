SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "Files needed for developing custom runners or frontends."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "krunner-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "8b2a178c2045d0fc7a80fba7bcc6e57b488a2e32744203aaed1fe8a2b10c065a5bd3d6588667de0ac4ffacdcc680386507a5b7b3a487b26c0f22d7a1cb1ef39d"

RPROVIDES:${PN} += "cmake-KF5Runner \
krunner-devel"

RDEPENDS:${PN} += "cmake-KF5Plasma \
cmake-Qt5Core \
extra-cmake-modules \
libKF5Runner5"

inherit rpm
