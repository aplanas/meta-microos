SUMMARY = "Gesture engine interface and support"
DESCRIPTION = "GEIS is a library for applications and toolkit programmers which \
provides a consistent platform independent interface for any \
system-wide input gesture recognition mechanism."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "libgeis1-2.2.17-4.10.aarch64.rpm"
RPM_HASH = "920febfacbe49cbaa564ba60af41945c70b889e82924dd0840094d4c05dc55f2f4af1a4d7cd478f02c10288ae7ca9fc717b670a09bbe16549fbc939d90e5bc7b"

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
