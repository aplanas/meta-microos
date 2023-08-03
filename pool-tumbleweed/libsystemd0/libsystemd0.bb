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

PV = "253.7"

RPM_NAME = "libsystemd0-253.7-2.1.aarch64.rpm"
RPM_HASH = "aec7f8d79175642ba94a17aa8d63a046f1433cb5f40ce4dd93f4e56cd76bcc6a86c8984482a30ec7ab67fa029b2a8ed3848219aa4981e04cde20130d367aba92"

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
