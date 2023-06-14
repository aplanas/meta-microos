SUMMARY = "FreeRADIUS Clients"
DESCRIPTION = "Collection of FreeRADIUS utilities."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-utils-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "c32d45a3589aab124dd1fed3fbcf671f92344097897e1c9f93cac5fe3166f5f82a1c1bed6419965eba753fb9821c310b1ff8b928b47946ce2a965d7524c879b1"

RPROVIDES:${PN} += "freeradius-server-utils"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
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
