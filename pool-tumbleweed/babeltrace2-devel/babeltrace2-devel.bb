SUMMARY = "Common Trace Format Babel Tower"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
The main format expected to be converted to/from is the \
Common Trace Format (CTF)."
LICENSE = "GPL-2.0-only & MIT"

PV = "2.0.5"

RPM_NAME = "babeltrace2-devel-2.0.5-1.1.aarch64.rpm"
RPM_HASH = "0afd0038513946d4fabcac90cb443c2075f777470d8c2d4cdb9755c6b7c41bb1cf7580b604b88244cc8869bf9ae409a75b47531c42ce790d7e126f9353ba48a5"

RPROVIDES:${PN} += "babeltrace2-devel \
pkgconfig-babeltrace2 \
pkgconfig-babeltrace2-ctf-writer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
babeltrace2"

inherit rpm
