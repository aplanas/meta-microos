SUMMARY = "Perl bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Perl bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "perl-rrdtool-1.8.0-3.4.aarch64.rpm"
RPM_HASH = "ce788bc36d84f16e3c29c06016037613617a46505023e6906292273d2cb99748b72812933214d6e8d92386b2e5e64e2f9c11a8c3d6f4cf75e9936115481a8250"

RPROVIDES:${PN} += "perl-RRDp \
perl-RRDs \
perl-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
perl \
rrdtool"

inherit rpm
