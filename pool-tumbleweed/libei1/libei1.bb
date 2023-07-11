SUMMARY = "Library for emulated input in Wayland"
DESCRIPTION = "libei is a library to send Emulated Input (EI) to a matching Emulated \
Input Server (EIS) which can receive those events with libeis. \
 \
It targets Wayland and provides separation, distinction and control, \
which, for comparison, are not available with XTEST (X11's emulated \
input)."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libei1-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "bf614457fa960521deefd3350823c93fbf0a1bef06506974716d19145044dd4be02f297cd99bba4ae3817009b2c3090b30960e24ff560f4d1f456ff110dfc5f3"

RPROVIDES:${PN} += "libei.so.1 \
libei1 \
libeis.so.1 \
liboeffis.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
