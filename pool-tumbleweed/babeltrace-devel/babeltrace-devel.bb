SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.5.8"

RPM_NAME = "babeltrace-devel-1.5.8-3.7.aarch64.rpm"
RPM_HASH = "709957046a93831f1a280a2121396564411f6213c9c6a6d54cf4bd071d5caff65fd52da5004e9475cd69f1d4f70860840cc779ed4ae349aaf5eeea64592ae024"

RPROVIDES:${PN} += "babeltrace-devel \
babeltrace-devel(aarch-64) \
pkgconfig(babeltrace) \
pkgconfig(babeltrace-ctf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
babeltrace \
pkgconfig(babeltrace) \
pkgconfig(popt) \
pkgconfig(uuid)"

inherit rpm
