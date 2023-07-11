SUMMARY = "Tcl bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Tcl bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "tcl-rrdtool-1.8.0-3.4.aarch64.rpm"
RPM_HASH = "41e4b4c7e3294024f8aa13e0d4cda036735f156620e0c4da3640044fc89ac2e62c445ddd9970c78c7f2b326cbd9b6ada261f174777aacb3bbb5d3ac2e5482588"

RPROVIDES:${PN} += "tcl-rrdtool"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
rrdtool \
tcl"

inherit rpm
