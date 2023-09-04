SUMMARY = "The procps library"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.3"

RPM_NAME = "libproc2-0-4.0.3-3.1.aarch64.rpm"
RPM_HASH = "e8050755f6e24b56bb927ae894bea05c4fb91444ae9158412f71f10e83a340f3b3c9fadb53ae1796103dbef00cd5051096408118dd7c76d5f9e56c7ffad22f4b"

RPROVIDES:${PN} += "libproc2-0 \
libproc2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
