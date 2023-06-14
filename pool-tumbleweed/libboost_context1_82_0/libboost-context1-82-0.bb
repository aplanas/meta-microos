SUMMARY = "Boost.Context runtime library"
DESCRIPTION = "Runtime support for Boost.Context, a library that providing cooperative \
multitasking support."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_context1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "dd5a0cc8f12e148b3b745ed5d80878436d97053e6fb59a7dbfb31c70cecad7df967b7435b824b322bbf2b5915771ce44230810c8e12af8ff364b7281e982994f"

RPROVIDES:${PN} += "libboost-context.so.1.82.0 \
libboost-context1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
