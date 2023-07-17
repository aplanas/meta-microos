SUMMARY = "Qt 5 Concurrent Library"
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
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Concurrent5-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "3944b5a3ad41e41e192ec48b1a30c3e7cf3ec84b3ad305f2250c896d3662f7b6fe9a1dfd930d95c13022d333d9c03e1dd95f4beaaf58ac2d37b37bb8a2f9e271"

RPROVIDES:${PN} += "libQt5Concurrent.so.5 \
libQt5Concurrent5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
