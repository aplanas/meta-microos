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

PV = "6.5.1"

RPM_NAME = "libQt6Concurrent6-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "8d10f3dcc2a85699e35d5e2aca70454bbf505848e16e5c0a7c1d01af9902272da506f1715c2586cae22e6f19b493169570f8aadad3fc9193a15de860494d2d2d"

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
