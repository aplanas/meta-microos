SUMMARY = "Ruby bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Ruby bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "ruby-rrdtool-1.8.0-3.1.aarch64.rpm"
RPM_HASH = "49c9af6e65c69ba38e2b049ff37d182f69615026d4c3e567f0926d1fba76add676e601bd222abec5c46f6cac28d93cefabc01d899e59600eaff86fed9a7c40d8"

RPROVIDES:${PN} += "ruby-rrdtool \
ruby-rrdtool(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
rrdtool \
ruby(abi)"

inherit rpm
