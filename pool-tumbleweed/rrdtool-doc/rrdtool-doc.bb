SUMMARY = "Documentation for rrdtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rrdtool-doc-1.8.0-3.1.aarch64.rpm"
RPM_HASH = "db8ce1d37d5a73d0cc254d3eb921011e71458a6f2dc8fb7ce78216b948ba68d3bb3f3d0e26128fd607fbef2a8071a7a2b3e7df70b96abb0b301cdd8b85145112"

RPROVIDES:${PN} += "rrdtool-doc \
rrdtool-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
