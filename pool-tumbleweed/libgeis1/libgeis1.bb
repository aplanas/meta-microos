SUMMARY = "Gesture engine interface and support"
DESCRIPTION = "GEIS is a library for applications and toolkit programmers which \
provides a consistent platform independent interface for any \
system-wide input gesture recognition mechanism."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "libgeis1-2.2.17-4.9.aarch64.rpm"
RPM_HASH = "074c560dd5b38271176532a5498f24c335540be5fc5c2be1eef614b377741be27ca3bfd76fa651d0f66cde0683d45032407017710d236c849d27105f94cfab10"

RPROVIDES:${PN} += "libgeis.so.1 \
libgeis1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libframe.so.6 \
libgrail.so.6 \
libm.so.6"

inherit rpm
