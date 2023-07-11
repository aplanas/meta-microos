SUMMARY = "FreeRADIUS shared library"
DESCRIPTION = "The FreeRADIUS shared libraries."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-libs-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "9297305c032192ecc2060f7d8355507025c8b398eecf4e3bcc3bc86dfdb6eb5cc0ff002672187f3bf0f39b0284bbc149d230ea11e19003ba1d05f103f4808fe5"

RPROVIDES:${PN} += "freeradius-server-libs \
libfreeradius-dhcp.so \
libfreeradius-eap.so \
libfreeradius-radius.so \
libfreeradius-server.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcap.so.1 \
libtalloc.so.2"

inherit rpm
