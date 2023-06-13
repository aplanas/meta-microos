SUMMARY = "An event loop library"
DESCRIPTION = "An event loop that is loosely modeled after libevent. Features \
include child/PID watchers, periodic timers based on wallclock \
(absolute) time (in addition to timers using relative timeouts), as \
well as epoll/kqueue/event ports/inotify/eventfd/signalfd support, \
timer management, time jump detection and correction. \
 \
This package holds the shared libraries of libev."
LICENSE = "BSD-2-Clause"

PV = "4.33"

RPM_NAME = "libev4-4.33-1.11.aarch64.rpm"
RPM_HASH = "389622e6cd43d15ff479b5adf811bcef86ba0151b87822b3d8f0a49f16848bf793a3b4ddb9e64f61ab38dfd433448ec0baeee3c3014997732bca3deb8bfc8791"

RPROVIDES:${PN} += "libev.so.4()(64bit) \
libev4 \
libev4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
