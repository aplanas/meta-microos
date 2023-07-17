SUMMARY = "C++ library for filezilla"
DESCRIPTION = "libfilezilla is C++ library, offering some basic functionality to \
build high-performing, platform-independent programs. libfilezilla is \
needed for filezilla (an FTP client and server) to build. Some of the \
highlights include: \
 \
* A typesafe, multi-threaded event system. \
* Timers for periodic events. \
* A datetime class that not only tracks timestamp but also their accuracy, \
  which simplifies dealing with timestamps originating from different sources. \
* Simple process handling for spawning child processes with redirected I/O."
LICENSE = "GPL-2.0-or-later"

PV = "0.44.0"

RPM_NAME = "libfilezilla40-0.44.0-1.1.aarch64.rpm"
RPM_HASH = "c33e6b696e6ac8290fefd86e3c0d1b1d86ba110f52d860d533fe9cef3f44555f5995e0eeb724831e07c49264747610838b97b0ce0e5ceb7cb5819cc5ca59e7ac"

RPROVIDES:${PN} += "libfilezilla \
libfilezilla.so.40 \
libfilezilla40"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgcc-s.so.1 \
libgmp.so.10 \
libgnutls.so.30 \
libhogweed.so.6 \
libnettle.so.8 \
libstdc++.so.6"

inherit rpm
