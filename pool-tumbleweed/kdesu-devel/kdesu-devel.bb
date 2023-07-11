SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kdesu-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "95dc655e570b4332f1caa7bcd4ccc0d737db7460c52ff1d3e74d6219884960d2793ba9de3dbf17b454c0afc8695d2df871e66e8a1bda98bd058e10f340c4d40c"

RPROVIDES:${PN} += "cmake-KF5Su \
kdesu-devel"

RDEPENDS:${PN} += "cmake-KF5Pty \
cmake-KF5Service \
extra-cmake-modules \
libKF5Su5"

inherit rpm
