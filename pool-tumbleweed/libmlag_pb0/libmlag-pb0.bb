SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains part of the mlag implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libmlag_pb0-8.4-4.2.aarch64.rpm"
RPM_HASH = "5f91d4f3fc2da5f2a7e82ff2ff14e18c83e7a5e888474f1f147d59bb918da2958164a7933ed5237519dfb1d243435f60bdce39c05cb2ce2082a210e1964a073f"

RPROVIDES:${PN} += "libmlag-pb.so.0 \
libmlag-pb0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
