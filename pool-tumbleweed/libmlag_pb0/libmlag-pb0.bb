SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains part of the mlag implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libmlag_pb0-8.4-4.1.aarch64.rpm"
RPM_HASH = "e46caa4d18862d8fa53301ad3c0ce88da6ebf4c592fd3b446f7f4b57a6573c1d3b674368a3cf784dfc6c8c72a93b15fc5fe3f9786939439c1f1bf2e17411086f"

RPROVIDES:${PN} += "libmlag-pb.so.0 \
libmlag-pb0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
