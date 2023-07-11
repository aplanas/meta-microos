SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming.  It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between the jobs \
and ThreadWeaver will work out the most efficient way of dividing the work between \
threads within a set of resource limits."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5ThreadWeaver5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "5d6bed5dcef1c82832ea43f3605f5259156e02968fad1899fa1bc4a342c83a675e1461222c6aa6f4ef8485913dd371feb7c2cb553b0351fdc2f0ba98395cc14d"

RPROVIDES:${PN} += "libKF5ThreadWeaver.so.5 \
libKF5ThreadWeaver5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
