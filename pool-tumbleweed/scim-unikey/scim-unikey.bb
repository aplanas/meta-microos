SUMMARY = "Vietnamese Input Method Engine for SCIM using Unikey IME"
DESCRIPTION = "SCIM (Smart Common Input Method) is an input method (IM) platform. \
scim-unikey is a IME for scim. Use for type Vietnamese \
Support via forum at: http://forum.ubuntu-vn.com/viewforum.php?f=85"
LICENSE = "GPL-2.0"

PV = "0.3.2"

RPM_NAME = "scim-unikey-0.3.2-1.29.aarch64.rpm"
RPM_HASH = "3278c40190f448f84c7b8fbcca8b23ae24ba22798d60ccdfa5f498e8e074aa4064eb1a49e111c41caa02171c483db4292701fbd2f0bd3d76ef37e86f1d8f6359"

RPROVIDES:${PN} += "libunikey-scim.so.1 \
scim-unikey"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libscim-1.0.so.8 \
libstdc++.so.6"

inherit rpm
