SUMMARY = "Perl bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Perl bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "perl-rrdtool-1.8.0-3.5.aarch64.rpm"
RPM_HASH = "5080db3ea20eec869f752c8d65a64f5b34bff17a1d6bb9b93cf32f5bf317b4ced68e67fbbe6881e37cc92216733e6b37b768d502aa39dfeb542aa044cbd545c6"

RPROVIDES:${PN} += "perl-RRDp \
perl-RRDs \
perl-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
perl \
rrdtool"

inherit rpm
