SUMMARY = "FreeRADIUS shared library"
DESCRIPTION = "The FreeRADIUS shared libraries."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-libs-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "67f924f969bcac6a703a2a3265807b2a620707b93f85935b931b8958b26a70d1fb1097186d40b4417d44fe2fe10575a095e307922c57c4073bfa274c18bc3294"

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
