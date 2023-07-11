SUMMARY = "File management over HTTP-based protocols"
DESCRIPTION = "Davix does file management over HTTP-based protocols. It focuses on \
remote I/O and data management of large collections of files. There \
is support for the WebDav, Amazon S3, Microsoft Azure, and HTTP \
protocols. \
 \
It provides a C++ library offering an HTTP API, a remote I/O API, and \
a POSIX compatibility layer. It also provides several utilities for \
file transfer, large collections of files management and large files \
management."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "davix-0.8.4-1.4.aarch64.rpm"
RPM_HASH = "4c7c137f770bd6f6e558cc6762de4837aeb9cc0919b82925568d7e553116435f0ec5b8083c09222b71e5e71dadef52aea06c5b1ccdf0e7a739211187da03faf8"

RPROVIDES:${PN} += "davix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdavix.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
