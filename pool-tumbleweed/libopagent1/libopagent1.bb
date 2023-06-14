SUMMARY = "System-Wide Profiler for Linux Systems"
DESCRIPTION = "OProfile is a system-wide profiler for Linux systems, capable of \
profiling all running code at low overhead. OProfile is released under \
the GNU GPL. \
 \
This package contains the library needed at runtime when profiling JITed code \
from supported virtual machines."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "libopagent1-1.4.0-2.1.aarch64.rpm"
RPM_HASH = "1b7ff664b65dca28353238e29e31041d4a72fab4691d6fd79bab9c750c5ed12421eb343d6e5aaac9a16dbaaf5293d58e9a98fa76f0eaeac746fdb8e16f688f2b"

RPROVIDES:${PN} += "libopagent.so.1 \
libopagent1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
