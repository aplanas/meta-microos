SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "GPL-2.0-only & MIT"

PV = "2.0.5"

RPM_NAME = "babeltrace2-2.0.5-1.1.aarch64.rpm"
RPM_HASH = "8addc17ed10e213cd31d273fda929271aeb7cce68829415ea72f46a72e2261d4c51731e7bd6916bee9f6ea45b0b230e089417e84fb6914c90836aab371405f77"

RPROVIDES:${PN} += "babeltrace2 \
libbabeltrace2-ctf-writer.so.0 \
libbabeltrace2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0"

inherit rpm
