SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.5.8"

RPM_NAME = "babeltrace-1.5.8-3.7.aarch64.rpm"
RPM_HASH = "49b6fdfdcdbfd2b18057e2ecd740451316f55e3fb5ca49b05f3c823526c3818f0c8b729e4708d21515773f7914e8a3952a8ce9e7808957d8a063cd7f38276e57"

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
