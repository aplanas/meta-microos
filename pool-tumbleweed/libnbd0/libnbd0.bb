SUMMARY = "Core library for nbd"
DESCRIPTION = "This is the NBD client library in userspace, a simple library for \
writing NBD clients."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libnbd0-1.14.1-2.2.aarch64.rpm"
RPM_HASH = "80b01b3fd0fbe6a13335a8ccd4df4f6e3fee9a1ce8e28c133c697fbcfdaeea52619ee2966ddee9f1f7b13fccc826920da59776122a6ece37d8b121e2709bd362"

RPROVIDES:${PN} += "libnbd.so.0 \
libnbd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libxml2.so.2"

inherit rpm
