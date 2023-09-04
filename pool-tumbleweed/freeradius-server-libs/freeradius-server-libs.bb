SUMMARY = "FreeRADIUS shared library"
DESCRIPTION = "The FreeRADIUS shared libraries."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-libs-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "2cfe702ffd2082c027e90adfff8595fc194f2651b8700ecde2aa3d176a44cbbef152e4f97514d2c3496b4508f7c1ad50d2edb4cb8f15b022f6e5b7284535252e"

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
