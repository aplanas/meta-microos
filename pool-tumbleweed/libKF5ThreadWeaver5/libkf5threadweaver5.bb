SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming.  It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between the jobs \
and ThreadWeaver will work out the most efficient way of dividing the work between \
threads within a set of resource limits."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5ThreadWeaver5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "2b0fb3f692e72d4ad39cdd35562e8720ba77ffb44d9cf487d8866ca5727e9b40ba3de05924247ad1a28f40428ce76b066912409015dffa02aa7cff73a15111f9"

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
