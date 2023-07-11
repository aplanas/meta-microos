SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.5.8"

RPM_NAME = "babeltrace-1.5.8-3.8.aarch64.rpm"
RPM_HASH = "d2974354705e59a990f4f0f8b8ed69e5be8b665b4c91867756834c41730adeef7bce3bf1a861964ad178fa499e228d56deec089530e7cacefe8b5c68f87bc556"

RPROVIDES:${PN} += "babeltrace \
libbabeltrace-ctf-metadata.so.1 \
libbabeltrace-ctf-text.so.1 \
libbabeltrace-ctf.so.1 \
libbabeltrace-dummy.so.1 \
libbabeltrace-lttng-live.so.1 \
libbabeltrace.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libpopt.so.0 \
libuuid.so.1"

inherit rpm
