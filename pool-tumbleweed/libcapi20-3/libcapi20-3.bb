SUMMARY = "Library for the Common ISDN Application Programming Interface"
DESCRIPTION = "libcapi handles requests from CAPI-driven applications such as fax \
systems via active and passive ISDN cards."
LICENSE = "LGPL-2.1-or-later"

PV = "3.27"

RPM_NAME = "libcapi20-3-3.27-2.9.aarch64.rpm"
RPM_HASH = "8cbff263325c4b205cfd506f83b3b47577a69e8852eaa4039c33a853b1e7471278b560d1f0ec0b8b98895f871309806ca637fd2a8391b948c73b32a564f75d7f"

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
