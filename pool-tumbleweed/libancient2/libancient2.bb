SUMMARY = "Decompression library for ancient formats"
DESCRIPTION = "This package provides the shared library for the decompression routines \
for ancient formats."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "libancient2-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "844277e411ecdd73f002b779cc6f098129a034721fd26c9b803a94ec526435fe54537aa61d8eb83a7dace528f71e2799a3fb0a060b2f30c5434a9fa0aeb8f3d4"

RPROVIDES:${PN} += "libancient.so.2 \
libancient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
