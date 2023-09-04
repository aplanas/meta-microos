SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming.  It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between the jobs \
and ThreadWeaver will work out the most efficient way of dividing the work between \
threads within a set of resource limits. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "threadweaver-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "d12f9b650fbeb2514030b741de01dc1bdd91d4567d762ed2aea38028faa457af87993baea2c4ad5cc1c6fe353718dcaebb071204e86adc36cd2a16e41d3e9db7"

RPROVIDES:${PN} += "cmake-KF5ThreadWeaver \
threadweaver-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5ThreadWeaver5"

inherit rpm
