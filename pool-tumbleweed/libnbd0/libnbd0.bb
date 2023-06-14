SUMMARY = "Core library for nbd"
DESCRIPTION = "This is the NBD client library in userspace, a simple library for \
writing NBD clients."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libnbd0-1.14.1-2.1.aarch64.rpm"
RPM_HASH = "aa36a5d9b9defe6725bd8919f148d01b51c0be7c77087a6449d8ec03ff6fa6be1f9526c1d577a889945e60dbcfdf14698a1304d06482d04947237eb446f1a4a3"

RPROVIDES:${PN} += "libnbd.so.0 \
libnbd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libxml2.so.2"

inherit rpm
