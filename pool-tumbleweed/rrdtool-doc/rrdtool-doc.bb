SUMMARY = "Documentation for rrdtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rrdtool-doc-1.8.0-3.4.aarch64.rpm"
RPM_HASH = "31426887886b128d094e0f5ec6f70bb56b02b5b859c3e7d67564f5d2a671d7d2b7c993edbbbb04d8de952ed4f5b8d49429350d36ef232ec30e300e9b31db1c10"

RPROVIDES:${PN} += "rrdtool-doc"

RDEPENDS:${PN} += ""

inherit rpm
