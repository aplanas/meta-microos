SUMMARY = "Molecular point group symmetry library"
DESCRIPTION = "A C library dealing with point group symmetry in molecules."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "libmsym0_2-0.2.3-2.6.aarch64.rpm"
RPM_HASH = "912d9894c07a3c62adbbcb4fd72b9f02d21b71de8544444cbe29b89a640b61c310c21c9b49f71405d70f42a9f3bd785ec3cfc902fb40c5a9bbdc9a3065a5aa94"

RPROVIDES:${PN} += "libmsym.so.0.2 \
libmsym0-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
