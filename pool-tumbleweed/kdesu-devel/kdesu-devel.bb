SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kdesu-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "be27df2997ffa7c8cb8f408d48181f667655b218f920c41d4a362bddda21cd35d79ee3f8d423fecfa2caa3aca10a411ef202622b31acd5c3e40c8978ccde0e7b"

RPROVIDES:${PN} += "cmake-KF5Su \
kdesu-devel"

RDEPENDS:${PN} += "cmake-KF5Pty \
cmake-KF5Service \
extra-cmake-modules \
libKF5Su5"

inherit rpm
