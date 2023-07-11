SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming.  It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between the jobs \
and ThreadWeaver will work out the most efficient way of dividing the work between \
threads within a set of resource limits. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "threadweaver-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "8b7ec251ab8fda1d71f99378d89c768f6787a25bf892d2b8c9aa9418a2eb2adb0b2f79732e19f778cb259e4f149f037fe5cd7f93eeb2c5bce96d5d088d9e6cdd"

RPROVIDES:${PN} += "cmake-KF5ThreadWeaver \
threadweaver-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5ThreadWeaver5"

inherit rpm
