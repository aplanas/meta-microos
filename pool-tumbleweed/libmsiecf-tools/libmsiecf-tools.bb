SUMMARY = "Utilities to inspect MS Internet Explorer Cache Files"
DESCRIPTION = "Several tools for reading MS Internet Explorer Cache files."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libmsiecf-tools-20221024-3.5.aarch64.rpm"
RPM_HASH = "ac6f477fcf8b0698b3411fe254e76dafe5c22cb07576530eef9a22927245a5041a86bcd6e661b5d64eae1183e6ba78982e78020d9a5988eef0b13e2fa893854c"

RPROVIDES:${PN} += "libmsiecf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libmsiecf.so.1"

inherit rpm
