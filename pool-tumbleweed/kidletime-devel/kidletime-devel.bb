SUMMARY = "Build environment for kidletime, an idle time singleton"
DESCRIPTION = "Development files for KIdleTime, which is a singleton reporting \
information on idle time. It is useful not only for finding out about \
the current idle time of the PC, but also for getting notified upon \
idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kidletime-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "182b3e16a206578f416cb33966bfc6b06bae4139c7204693f75f44bc9bdb54f75f2823f8888c07769437dfc9e3ca963b6d8f5365d32aa69f447ab59ce64ab2c0"

RPROVIDES:${PN} += "cmake-KF5IdleTime \
kidletime-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5IdleTime5"

inherit rpm
