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

PV = "253.8"

RPM_NAME = "libsystemd0-253.8-1.2.aarch64.rpm"
RPM_HASH = "413f8657c4e81a85b0327da7d897cfe8c04fceb8f9a0f550e5de65a6286290070d54c7c56191fe9f58fa1859d89706b9995f08d0839483091d4b69c9e037b447"

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
