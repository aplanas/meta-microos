SUMMARY = "FreeRADIUS Clients"
DESCRIPTION = "Collection of FreeRADIUS utilities."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-utils-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "4d1fbc4e70c210e1dee9165fc9dee701b0dc8da371fd73209054cb46324ccc8dc83140ec5157e60dd033aa50dccce9b04701c37405d1602ba36117f8507fb878"

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
