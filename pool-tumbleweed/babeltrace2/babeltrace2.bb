SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "MIT & GPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "babeltrace2-2.0.4-1.10.aarch64.rpm"
RPM_HASH = "84b6df4fc36ebc29edb82587e50eb9ab8fd7cd540c54528088fa9cb95c489898d6fd57f3a09f28399591f73f9ec61e70543cb373c6b9b7d076fe01943923df25"

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
