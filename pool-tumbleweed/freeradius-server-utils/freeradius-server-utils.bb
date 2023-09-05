SUMMARY = "FreeRADIUS Clients"
DESCRIPTION = "Collection of FreeRADIUS utilities."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-utils-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "f3c8a322398d233040ffa1c1e384b429faf381a92d214159e2be32607cb5ea6ff2d021ef62bd761bd75118c4492c41954e63af350b812f8065fa4daf0ed32376"

RPROVIDES:${PN} += "freeradius-server-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
freeradius-server-libs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfreeradius-dhcp.so \
libfreeradius-eap.so \
libfreeradius-radius.so \
libfreeradius-server.so \
libgdbm.so.6 \
libpcap.so.1 \
libssl.so.3 \
libtalloc.so.2"

inherit rpm
