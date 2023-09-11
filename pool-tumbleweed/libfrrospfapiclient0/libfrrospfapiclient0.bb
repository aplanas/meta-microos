SUMMARY = "API for FRRouting's OSPFv2 implementation"
DESCRIPTION = "This library contains part of the OSPFv2 implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrospfapiclient0-8.4-5.1.aarch64.rpm"
RPM_HASH = "34f6a36f6236ccf89c1e5dceddaed62bbdbfd39e4df7ad84d1dd5b4c181622672e6250e881d381a6fcddf3e7584726ab915e28d3d6b940aa30d19ef72b47a688"

RPROVIDES:${PN} += "libfrrospfapiclient.so.0 \
libfrrospfapiclient0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libfrr.so.0"

inherit rpm
