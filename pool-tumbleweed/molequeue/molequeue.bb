SUMMARY = "Desktop integration of high performance computing resources"
DESCRIPTION = "System-tray resident desktop application for abstracting, managing, \
and coordinating the execution of tasks both locally and on remote \
computational resources. \
 \
Features: \
 \
 * Open source distributed under the liberal 3-clause BSD license \
 * Cross platform with nightly builds on Linux, Mac OS X and Windows \
 * Intuitive interface designed to be useful to whole community \
 * Support for local executation and remote schedulers (SGE, PBS, SLURM) \
 * System tray resident application managing queue of queues and job lifetime \
 * Simple, lightweight JSON-RPC 2.0 based communication over local sockets \
 * Qt 5 client library for simple integration in Qt applications"
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-0.9.0-3.9.aarch64.rpm"
RPM_HASH = "3df8238583c0be0ce98edccecf169f547cf18e7271068f1d96b3f868c2127f3f47474b927217f74438a7fb0c6ea205641b4128548199ec5579fb983862983cb6"

RPROVIDES:${PN} += "application() \
application(molequeue.desktop) \
molequeue \
molequeue(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libMoleQueueClient.so()(64bit) \
libMoleQueueServerCore.so()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
molequeue-libs0(aarch-64)"

inherit rpm
