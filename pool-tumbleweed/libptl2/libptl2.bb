SUMMARY = "Parallel Tasking Library"
DESCRIPTION = "Parallel Tasking Library (PTL) is a C++11 multithreading tasking \
system on top of std::thread featuring thread pools, task groups, \
and lock-free task queues. \
 \
This package provides the shared library for PTL."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "libptl2-2.3.3-1.10.aarch64.rpm"
RPM_HASH = "ae3a7f59f9e1b4ad01a695932d46f50b3bb5969bdbe87d9ae4fb7d755e67bbf057fed424bb3e52c3fb4cbb13adf2b676819694c9f9cf6236909fb6c2df31b6fb"

RPROVIDES:${PN} += "libptl.so.2 \
libptl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
