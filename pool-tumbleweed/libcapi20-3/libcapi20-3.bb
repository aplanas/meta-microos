SUMMARY = "Library for the Common ISDN Application Programming Interface"
DESCRIPTION = "libcapi handles requests from CAPI-driven applications such as fax \
systems via active and passive ISDN cards."
LICENSE = "LGPL-2.1-or-later"

PV = "3.27"

RPM_NAME = "libcapi20-3-3.27-2.8.aarch64.rpm"
RPM_HASH = "b2cc128f6b2c4a8ab1917f82014001ceb0f53b86e66bcccb63abce4990379d8ab872a6c9bbaf8de479299c7419fb15e1807a2ab58aa457c93af6919846215391"

RPROVIDES:${PN} += "capi4linux \
lib-capi-mod-fritzbox.so.2 \
lib-capi-mod-rcapi.so.2 \
lib-capi-mod-std.so.2 \
libcapi20-3 \
libcapi20.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
