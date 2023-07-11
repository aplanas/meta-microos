SUMMARY = "FRRouting fpm protobuf library"
DESCRIPTION = "This library contains forwarding plane manager protobuf definitions \
for FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrfpm_pb0-8.4-4.2.aarch64.rpm"
RPM_HASH = "c2803c56f1a8362b66fed89949d58108470f0d42ec8fd7de3aa35618fdaafbb72bd6fd94242d25d425457d01ce3c5a09e87e8e2a0520d4c09d2fdd8ead85703e"

RPROVIDES:${PN} += "libfrrfpm-pb.so.0 \
libfrrfpm-pb0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
