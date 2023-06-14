SUMMARY = "Thrift non-blocking server library"
DESCRIPTION = "Shared library providing the non-blocking server component of the \
Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthriftnb-0_17_0-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "a37b8184a1616d2751952b02459d545e1e39cd5e0a25dba207f0621945536a4abf0b2b362bb7d004a6125733fa37bb2f4bfbb31bdff8e3d9f43e582296e23889"

RPROVIDES:${PN} += "libthriftnb-0-17-0 \
libthriftnb-0.17.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
