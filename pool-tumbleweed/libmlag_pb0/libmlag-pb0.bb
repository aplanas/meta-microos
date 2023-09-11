SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains part of the mlag implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libmlag_pb0-8.4-5.1.aarch64.rpm"
RPM_HASH = "9c05f49b13dc8cea3aca81c8acaf7ba328bce60b878636d58f1bcf48a099f2e8a939bfb9a724e956b7572be8b0afecfef4ddaa5e1253a82f8d0fd5c2226bf8f5"

RPROVIDES:${PN} += "libmlag-pb.so.0 \
libmlag-pb0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
