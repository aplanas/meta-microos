SUMMARY = "Component library for systemd"
DESCRIPTION = "This library provides several of the systemd C APIs: \
 \
* sd-bus implements an alternative D-Bus client library that is \
  relatively easy to use, very efficient and supports both classic \
  D-Bus as well as kdbus as transport backend. \
 \
* sd-daemon(3): for system services (daemons) to report their status \
  to systemd and to make easy use of socket-based activation logic \
 \
* sd-event is a generic event loop abstraction that is built around \
  Linux epoll, but adds features such as event prioritization or \
  efficient timer handling. \
 \
* sd-id128(3): generation and processing of 128-bit IDs \
 \
* sd-journal(3): API to submit and query journal log entries \
 \
* sd-login(3): APIs to introspect and monitor seat, login session and \
  user status information on the local system."
LICENSE = "LGPL-2.1-or-later"

PV = "253.5"

RPM_NAME = "libsystemd0-253.5-5.1.aarch64.rpm"
RPM_HASH = "f3e4ec6cd8e609bbc4915b12350e949b4d60fffce127f6aba8c9283cbed2474ce03bc023955ee3657f2c5250d0c7549575e16e208d1b332023ff07cdb619e200"

RPROVIDES:${PN} += "libsystemd.so.0 \
libsystemd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libgcrypt.so.20 \
liblz4.so.1 \
liblzma.so.5 \
libzstd.so.1"

inherit rpm
