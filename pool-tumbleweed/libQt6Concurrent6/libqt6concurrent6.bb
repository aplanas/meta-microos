SUMMARY = "Qt 6 Concurrent library"
DESCRIPTION = "The QtConcurrent namespace provides high-level APIs that help write \
multi-threaded programs without using low-level threading primitives \
such as mutexes, read-write locks, wait conditions, or semaphores. \
Programs written with QtConcurrent automatically adjust the number of \
threads used according to the number of processor cores available. \
 \
QtConcurrent includes functional programming style APIs for parallel \
list processing, including a MapReduce and FilterReduce \
implementation for shared-memory (non-distributed) systems, and \
classes for managing asynchronous computations in GUI applications."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Concurrent6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c9c14e3f69fcdca6e8113c49a6edad04018dff821db6cbb2b53d85206a3c4bd622e8e593bb4fe9ef0ef006a5f8d0ff49d1438cbd5a1c3a26e951d3136496a1c0"

RPROVIDES:${PN} += "libQt6Concurrent.so.6 \
libQt6Concurrent6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
