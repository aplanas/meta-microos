SUMMARY = "Library for solving linear systems over integers for 4ti2"
DESCRIPTION = "This package contains the 4ti2 library for solving systems linear systems over \
integers (\\mathbb{Z})."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.10"

RPM_NAME = "libzsolve0-1.6.10-1.2.aarch64.rpm"
RPM_HASH = "d4c2a2258466ddf2a3d982390097dfc76f44e9f0a40e16f0a77860b17c73583ff0e2627e178e96ecd907fa4c07d351c0cb7c4549861f03c74ea110cc83d9398b"

RPROVIDES:${PN} += "libzsolve.so.0 \
libzsolve0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libstdc++.so.6"

inherit rpm
