SUMMARY = "Library offering davix APIs for HTTP, remote I/O, and POSIX compatibility layer"
DESCRIPTION = "This package provides the shared libraries for davix with APIs for \
HTTP, remote I/O, and a POSIX compatibility layer."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "libdavix0-0.8.4-1.4.aarch64.rpm"
RPM_HASH = "37b389edb92872fbb3c1575879c6cce9d6686bd42fe368cc7aa9d13453a5d74656fdc3aa01ea8894d4b7faa8985452b330d570c8c0e19493773fbfef1e9a7537"

RPROVIDES:${PN} += "libdavix.so.0 \
libdavix0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libuuid.so.1 \
libxml2.so.2 \
libz.so.1"

inherit rpm
