SUMMARY = "FreeRADIUS shared library"
DESCRIPTION = "The FreeRADIUS shared libraries."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-libs-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "a5b4b279a14b24e5fe8c060490f914bcb5c8403d4d70c703c01237e59b508c55125c28f8564dc0b435b838c4d827a8d3c8f91191473222434eccd263a40c9b82"

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
