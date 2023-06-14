SUMMARY = "Parallel Tasking Library"
DESCRIPTION = "Parallel Tasking Library (PTL) is a C++11 multithreading tasking \
system on top of std::thread featuring thread pools, task groups, \
and lock-free task queues. \
 \
This package provides the shared library for PTL."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "libptl2-2.3.3-1.8.aarch64.rpm"
RPM_HASH = "0183c60df31c5144bef7ac2cf2733b202b8369025404a4b2cc641b6254c99e957d5b61e2acebf0b426e10ed03b3b592b5ed1964952671b99506b6e9c73b37d90"

RPROVIDES:${PN} += "libptl.so.2 \
libptl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
