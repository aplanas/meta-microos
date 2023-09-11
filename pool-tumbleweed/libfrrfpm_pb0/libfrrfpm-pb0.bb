SUMMARY = "FRRouting fpm protobuf library"
DESCRIPTION = "This library contains forwarding plane manager protobuf definitions \
for FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrfpm_pb0-8.4-5.1.aarch64.rpm"
RPM_HASH = "47e6a23fd8245ec8525194b7429411ea1f0993b94cbb5ad81dc0c1e40321d5dffcdd722a57ff2a11d59635c27fa1b8e6cc0874d182e528d409bc992784d626a5"

RPROVIDES:${PN} += "libfrrfpm-pb.so.0 \
libfrrfpm-pb0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
