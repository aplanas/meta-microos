SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming.  It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between the jobs \
and ThreadWeaver will work out the most efficient way of dividing the work between \
threads within a set of resource limits. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "threadweaver-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "aca6224fa0cf8a42aaef408ea5007fa3ddb31706ed4635efb86fc5a02bf599e4b658746f236fa556f92d9f65d4507e9a965250350bcdfd28286f3805e2d9097f"

RPROVIDES:${PN} += "cmake-KF5ThreadWeaver \
threadweaver-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5ThreadWeaver5"

inherit rpm
