SUMMARY = "Screen region selection library"
DESCRIPTION = "This library implements the slop utility's functionality to mark a \
region ont the screen."
LICENSE = "GPL-3.0-or-later"

PV = "7.6"

RPM_NAME = "libslopy7_6-7.6-2.7.aarch64.rpm"
RPM_HASH = "00a20deed5e4b084dab9fb0fd1e74b1ca909ed0897c7141ce00a9792f24ac0f9a9b48ada6d43276bd6b9559038bab89768572b371f13e4c8a612ce6165efab8e"

RPROVIDES:${PN} += "libslopy.so.7.6 \
libslopy7-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libX11.so.6 \
libXext.so.6 \
libXrender.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
