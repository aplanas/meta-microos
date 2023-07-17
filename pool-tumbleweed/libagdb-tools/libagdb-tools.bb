SUMMARY = "Utilities for reading SuperFetch databases"
DESCRIPTION = "This subpackage contains the utility programs from libagdb to \
read SuperFetch databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb-tools-20210429-3.8.aarch64.rpm"
RPM_HASH = "58579936cc9eccd2c28b1ecd13ca61ae9fc15317e95eb78328d92fb82c7544f63708b1a26b5fa23325302f6a7336cc45b46b262aeaba7c17cd1e09624a2d1797"

RPROVIDES:${PN} += "libagdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libagdb.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1"

inherit rpm
