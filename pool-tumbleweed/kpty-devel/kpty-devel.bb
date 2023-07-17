SUMMARY = "Development files for kpty, a pseudo terminal device interface"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kpty-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "12d41e883a2243adac06b27625f88895296fd6c2546fe0f651c45bd38265e70e57c45942a1ae9d5bc4d86b0ba8d7fa6b63af676019502a2c776db6efc1fe2f9c"

RPROVIDES:${PN} += "cmake-KF5Pty \
kpty-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-Qt5Core \
extra-cmake-modules \
libKF5Pty5"

inherit rpm
