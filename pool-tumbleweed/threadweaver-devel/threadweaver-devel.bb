SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming.  It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between the jobs \
and ThreadWeaver will work out the most efficient way of dividing the work between \
threads within a set of resource limits. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "threadweaver-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "02e3cca306402949ddb3df4c4e5bcd7e4b5e8928ad61b4d7dccfdf251baf5ba8a44818efc3e2b53bead59120479ace8a2b0300fbcd2777d877ab5a20b13c07ca"

RPROVIDES:${PN} += "cmake-KF5ThreadWeaver \
threadweaver-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5ThreadWeaver5"

inherit rpm
