SUMMARY = "Build environment for kidletime, an idle time singleton"
DESCRIPTION = "Development files for KIdleTime, which is a singleton reporting \
information on idle time. It is useful not only for finding out about \
the current idle time of the PC, but also for getting notified upon \
idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kidletime-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "031eb555306183dd90b3779d60e0246fb715dbf47b5c47b8b2d5c26cfc4ae8dba14379ec2bda92c9ff2f278e584b3321461a968e43f9f3cc616bbf505f259c6f"

RPROVIDES:${PN} += "cmake-KF5IdleTime \
kidletime-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5IdleTime5"

inherit rpm
