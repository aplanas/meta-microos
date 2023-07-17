SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming.  It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between the jobs \
and ThreadWeaver will work out the most efficient way of dividing the work between \
threads within a set of resource limits."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5ThreadWeaver5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "fe8b6e9417247e060e9f23890cacdaab67f3a5e2dfe1a6c4ee75ef1ef2aeb57f0cf91c96d46980166a3fdc8cf6e1b7aaddde60b2e5eb57070a2eeb55e7de7c7d"

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
