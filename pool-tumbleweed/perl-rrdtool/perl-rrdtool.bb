SUMMARY = "Perl bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Perl bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "perl-rrdtool-1.8.0-3.1.aarch64.rpm"
RPM_HASH = "6232f076aa46a5ff0aaf23b9a3d6834e38002862afcf4f1c5abc7fb4ffc5597bf0d83a1c022da59526589cefdf09f75e629e3ea0a9d3f720538d3bf0e7c2dc44"

RPROVIDES:${PN} += "perl(RRDp) \
perl(RRDs) \
perl-rrdtool \
perl-rrdtool(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
librrd.so.8()(64bit) \
perl \
rrdtool"

inherit rpm
