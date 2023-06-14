SUMMARY = "Build environment for kidletime, an idle time singleton"
DESCRIPTION = "Development files for KIdleTime, which is a singleton reporting \
information on idle time. It is useful not only for finding out about \
the current idle time of the PC, but also for getting notified upon \
idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kidletime-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "5ae1b23dd9ee0a66f96a69a6a1c1613b8108f2fc1dbd5f1c11fd3d5109b90a21cc50c4d2e28ecfe107271170aa6bf73661407f70fc7f668c92cf05a9a5157d31"

RPROVIDES:${PN} += "cmake-KF5IdleTime \
kidletime-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5IdleTime5"

inherit rpm
