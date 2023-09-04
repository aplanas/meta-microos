SUMMARY = "Tcl bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Tcl bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "tcl-rrdtool-1.8.0-3.5.aarch64.rpm"
RPM_HASH = "6b09499936b4d7c7ce0600354afd0b6e60d47d2279d2a243a6f8850857396fec9adb2d826a71149400994ffcf9b4be6628ea8abd9101dc1c078a59c47af1411e"

RPROVIDES:${PN} += "tcl-rrdtool"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
rrdtool \
tcl"

inherit rpm
