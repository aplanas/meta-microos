SUMMARY = "FRRouting fpm protobuf library"
DESCRIPTION = "This library contains forwarding plane manager protobuf definitions \
for FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrfpm_pb0-8.4-4.1.aarch64.rpm"
RPM_HASH = "721a50494ddadebeb59fb8196e727546e9d7b566829b9540d90f300533cfc2bdc926daad60d30dadc3295fb0b73bd9506479eb5bb151f9c53022bd1ea31cfbba"

RPROVIDES:${PN} += "libfrrfpm_pb.so.0()(64bit) \
libfrrfpm_pb0 \
libfrrfpm_pb0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
