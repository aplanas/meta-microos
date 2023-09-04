SUMMARY = "Parallel Tasking Library"
DESCRIPTION = "Parallel Tasking Library (PTL) is a C++11 multithreading tasking \
system on top of std::thread featuring thread pools, task groups, \
and lock-free task queues. \
 \
This package provides the shared library for PTL."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "libptl2-2.3.3-1.11.aarch64.rpm"
RPM_HASH = "7f32b1bc73919d8527f6964dabc271f62bb0ee08ca3b118ffbed6fe049833b64182fedb976cb353f6f8cefd4c5688166d15470326d0a878f6a1c94c514d190ce"

RPROVIDES:${PN} += "libptl.so.2 \
libptl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
