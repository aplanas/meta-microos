SUMMARY = "Development files for libev"
DESCRIPTION = "An event loop that is loosely modeled after libevent. Features \
include child/PID watchers, periodic timers based on wallclock \
(absolute) time (in addition to timers using relative timeouts), as \
well as epoll/kqueue/event ports/inotify/eventfd/signalfd support, \
timer management, time jump detection and correction. \
 \
It can be used as a libevent replacement using its emulation API, or \
directly embedded into programs. An optional Perl interface is \
available. \
 \
This package holds the development files for libev."
LICENSE = "BSD-2-Clause"

PV = "4.33"

RPM_NAME = "libev-devel-4.33-1.11.aarch64.rpm"
RPM_HASH = "a97b883c7950e0bcd293deafb02f9fd49f193e9d7ff2498f39733eba5f618ca17433d7df2442beec09cbf0a0aafdbb843a0a2b8b465dc1abc43f5bb9edcd0c79"

RPROVIDES:${PN} += "libev-devel \
libev-devel(aarch-64) \
pkgconfig(libev)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libev4"

inherit rpm
