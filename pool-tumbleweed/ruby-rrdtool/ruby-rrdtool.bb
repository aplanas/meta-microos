SUMMARY = "Ruby bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Ruby bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "ruby-rrdtool-1.8.0-3.5.aarch64.rpm"
RPM_HASH = "3f5fc193332c9c51c415cf8187b21dde47545dafd03a3dc60f454b31ad815850f69453ed4220fa51eeab6abda18aea99346030586d74f8080242397e87141464"

RPROVIDES:${PN} += "ruby-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
rrdtool \
ruby-abi"

inherit rpm
