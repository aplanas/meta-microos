SUMMARY = "Build environment for kidletime, an idle time singleton"
DESCRIPTION = "Development files for KIdleTime, which is a singleton reporting \
information on idle time. It is useful not only for finding out about \
the current idle time of the PC, but also for getting notified upon \
idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kidletime-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "acd74561d880e0ab83ba68ebd3cc95885ebc1c2b78483ac4d05e67f0d316d3624f596d67dcf57952a6006f87385370648757d6500fac1c5aef5a84dfc6135c76"

RPROVIDES:${PN} += "cmake-KF5IdleTime \
kidletime-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5IdleTime5"

inherit rpm
