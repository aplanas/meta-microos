SUMMARY = "System-Wide Profiler for Linux Systems"
DESCRIPTION = "OProfile is a system-wide profiler for Linux systems, capable of \
profiling all running code at low overhead. OProfile is released under \
the GNU GPL. \
 \
This package contains the library needed at runtime when profiling JITed code \
from supported virtual machines."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "libopagent1-1.4.0-2.2.aarch64.rpm"
RPM_HASH = "ef4ce879461cc8f047bcca1b15da856472ca0ea9a41832066b3fae8fc641518dfd4d055d99f9f72ff7c797f38a4b74ec2f4ccc65cbaf0766a490ff67a98c3898"

RPROVIDES:${PN} += "libopagent.so.1 \
libopagent1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
