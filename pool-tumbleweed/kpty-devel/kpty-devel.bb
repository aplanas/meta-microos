SUMMARY = "Development files for kpty, a pseudo terminal device interface"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kpty-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "499186737226e7056bb8dc7271a52b456f935a7726e3e454a3732532fefb2b8b756797aa79f4581bb74b28707c753b25a1f070893fcd15453c7bc089c875d934"

RPROVIDES:${PN} += "cmake-KF5Pty \
kpty-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-Qt5Core \
extra-cmake-modules \
libKF5Pty5"

inherit rpm
