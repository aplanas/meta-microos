SUMMARY = "Tcl bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Tcl bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "tcl-rrdtool-1.8.0-3.1.aarch64.rpm"
RPM_HASH = "40081ed46452005a5ba29651c6c54425f84963b2f1ea4ff8bf85e176e6a407afe1fd3a7f4086804527213449e5f86a97d5b7ff5ec3aa3aabac3deed7ab740629"

RPROVIDES:${PN} += "tcl-rrdtool \
tcl-rrdtool(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
librrd.so.8()(64bit) \
rrdtool \
tcl"

inherit rpm
