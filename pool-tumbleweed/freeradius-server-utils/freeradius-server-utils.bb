SUMMARY = "FreeRADIUS Clients"
DESCRIPTION = "Collection of FreeRADIUS utilities."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-utils-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "c32d45a3589aab124dd1fed3fbcf671f92344097897e1c9f93cac5fe3166f5f82a1c1bed6419965eba753fb9821c310b1ff8b928b47946ce2a965d7524c879b1"

RPROVIDES:${PN} += "freeradius-server-utils \
freeradius-server-utils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
freeradius-server-libs \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libfreeradius-dhcp.so()(64bit) \
libfreeradius-eap.so()(64bit) \
libfreeradius-radius.so()(64bit) \
libfreeradius-server.so()(64bit) \
libgdbm.so.6()(64bit) \
libpcap.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
