SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "MIT & GPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "babeltrace2-2.0.4-1.11.aarch64.rpm"
RPM_HASH = "13f65e0d8eb17a6727bf1ae615ccd6c0821d6b1799eab82288b0cbe6fc03ae36ea4854200107f694f20bf4a3244aa32c23168d8db83525ca4407baa7f94ee781"

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
