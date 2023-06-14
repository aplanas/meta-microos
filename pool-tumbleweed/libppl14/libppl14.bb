SUMMARY = "C++ interface of the Parma Polyhedra Library"
DESCRIPTION = "Shared library for the Parma Polyhedra Library."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "libppl14-1.2-3.1.aarch64.rpm"
RPM_HASH = "f2cdcf6d7f7a55984eccfad33f73fdaf738e26e13ff9aedabd0f74aefd07effde9bde6cf79b55518b8897c768f0bb2f07306eec1d5ee6574ce64c5d5cf37e65a"

RPROVIDES:${PN} += "libppl.so.14 \
libppl14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
