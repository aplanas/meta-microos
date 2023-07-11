SUMMARY = "heXoNet RFB (remote control for the X Window System)"
DESCRIPTION = "The heXoNet RFB Software package includes many different projects. The \
goal of this package is to provide a comprehensive collection of \
rfb-enabled tools and applications. One application, x0rfbserver, was, \
and maybe still is, the only complete remote control solution for the X \
Window System."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "rfb-0.6.1-703.12.aarch64.rpm"
RPM_HASH = "912cd0db090d88c17efd724f26fea3c06053955bf169bf7044d99ae663166ef157cc14b000d9b220bc07de19e38d9e266f7f379a9ee7bc19044ebcce08e2d091"

RPROVIDES:${PN} += "rfb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXtst.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxclass.so.0.9.2 \
libz.so.1 \
xclass"

inherit rpm
