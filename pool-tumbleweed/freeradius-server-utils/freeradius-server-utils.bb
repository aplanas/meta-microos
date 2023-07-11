SUMMARY = "FreeRADIUS Clients"
DESCRIPTION = "Collection of FreeRADIUS utilities."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-utils-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "0d6e25ddd4dbd4f76585565a835a0e16b4f4ba524d4883ef403950fe0723fa4e210f44611ad77da7597e9e133e2b14e62b544ea0c474bb747c5c580dbc0267ae"

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
