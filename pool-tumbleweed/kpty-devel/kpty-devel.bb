SUMMARY = "Development files for kpty, a pseudo terminal device interface"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kpty-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "94a465b2bb490e55120972ab768be558ffd80a55d855c30fbb1d793d2d679c61d56047a309dda048ca3e4f24d6cc92aeee0c54162f3addff50ec35ac640740e6"

RPROVIDES:${PN} += "cmake-KF5Pty \
kpty-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-Qt5Core \
extra-cmake-modules \
libKF5Pty5"

inherit rpm
