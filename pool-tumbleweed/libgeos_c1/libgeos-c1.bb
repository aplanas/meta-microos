SUMMARY = "C language interface for the GEOS library"
DESCRIPTION = "This subpackage contains a shared library providing a C linkage \
interface for the (C++) GEOS library."
LICENSE = "LGPL-2.1-only"

PV = "3.11.2"

RPM_NAME = "libgeos_c1-3.11.2-2.1.aarch64.rpm"
RPM_HASH = "0deb81afb648bc09af9f3303ce985091fd4ff00ee4040ca12dae01f9160836b9fcf689e3995cca64bd27f8c1f6a2d0bb3d26c354508fb23c56ddb8d050d1762f"

RPROVIDES:${PN} += "libgeos-c.so.1 \
libgeos-c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgeos.so.3.11.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
