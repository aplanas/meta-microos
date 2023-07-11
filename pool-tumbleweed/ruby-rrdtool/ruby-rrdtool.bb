SUMMARY = "Ruby bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Ruby bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "ruby-rrdtool-1.8.0-3.4.aarch64.rpm"
RPM_HASH = "9523812e05f0a498a00c115de3977d4914f0339f0fed5c7f89158665160ae380c604fb83d434b261cb82202d5f0b5c0d440d9eaa846d2687d76569eecc235d29"

RPROVIDES:${PN} += "ruby-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
rrdtool \
ruby-abi"

inherit rpm
