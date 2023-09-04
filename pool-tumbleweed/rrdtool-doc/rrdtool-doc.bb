SUMMARY = "Documentation for rrdtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rrdtool-doc-1.8.0-3.5.aarch64.rpm"
RPM_HASH = "e182d6e2e6b19e932ef97afacc94ad3c2b5a41814c439f9e2ea3370187578f31d599e2c7f92b156d669627fb0ec04bb54085f56acd68e106d21eeda170a17f16"

RPROVIDES:${PN} += "rrdtool-doc"

RDEPENDS:${PN} += ""

inherit rpm
