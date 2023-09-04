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

RPM_NAME = "libQt6Concurrent6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "2bfba0bee362b4cf455d7f24e8eb1d1e63287eb2628e1a6b0b7f9565cb262d9db25a5b22846e45810f3967eb2f4e47f8318a696d89150e3e9ea697245e371bfd"

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
