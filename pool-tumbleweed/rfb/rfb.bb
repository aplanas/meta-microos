SUMMARY = "heXoNet RFB (remote control for the X Window System)"
DESCRIPTION = "The heXoNet RFB Software package includes many different projects. The \
goal of this package is to provide a comprehensive collection of \
rfb-enabled tools and applications. One application, x0rfbserver, was, \
and maybe still is, the only complete remote control solution for the X \
Window System."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "rfb-0.6.1-703.11.aarch64.rpm"
RPM_HASH = "bd34b79a8da43309a67ed1f55cc9911bbdc765f2ae1ca2502ac5755f7b4282eb8fcb0b0edee0e664e47b1c475a78e318bdfe58f02c2e014fc420f1d0797ef9cc"

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
