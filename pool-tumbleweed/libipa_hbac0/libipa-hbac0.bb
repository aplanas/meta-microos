SUMMARY = "FreeIPA HBAC Evaluator library"
DESCRIPTION = "Utility library to validate FreeIPA HBAC rules for authorization \
requests."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "libipa_hbac0-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "14e3bad4c4247ac5974e4dfccd75aa3f46d5d407167a0f3c001098a0d804de2bdc3c5b39ddd268e3c593a46122c657dbfb64afeb276921e47fb1e01385837720"

RPROVIDES:${PN} += "libipa-hbac.so.0 \
libipa-hbac0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libunistring.so.5"

inherit rpm
