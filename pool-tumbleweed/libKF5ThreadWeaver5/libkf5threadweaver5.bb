SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming.  It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between the jobs \
and ThreadWeaver will work out the most efficient way of dividing the work between \
threads within a set of resource limits."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5ThreadWeaver5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "c78d046a754e4044cbba82fa019094acdee597536897087c73af9a88f7ce800c439df8157b36d1e7aadd3e6acdec2352083108c43051e7a6811234553b6d69a2"

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
