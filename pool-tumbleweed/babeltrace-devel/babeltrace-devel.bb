SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.5.8"

RPM_NAME = "babeltrace-devel-1.5.8-3.8.aarch64.rpm"
RPM_HASH = "45e2808a28a973792dc029c48a3b13f7880b67f69a77a99983fe6967b967395b85a43edc950247f10600885dbc3f3fe080f23608c6e454f3d0224ced29f53ce9"

RPROVIDES:${PN} += "babeltrace-devel \
pkgconfig-babeltrace \
pkgconfig-babeltrace-ctf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
babeltrace \
pkgconfig-babeltrace \
pkgconfig-popt \
pkgconfig-uuid"

inherit rpm
