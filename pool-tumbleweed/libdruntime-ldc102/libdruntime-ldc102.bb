SUMMARY = "Minimal D runtime library"
DESCRIPTION = "The minimal runtime library required to support the D programming language."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "libdruntime-ldc102-1.32.0-1.2.aarch64.rpm"
RPM_HASH = "fdd62224f018be416c3f635164095d9eb94693a9d63cd758a7167d24c7afc0291753fc159de7fe21ed00064db7331ec150d1d2c7a786acd26ad3ac6606f0e806"

RPROVIDES:${PN} += "libdruntime-ldc-debug-shared.so.102 \
libdruntime-ldc-shared.so.102 \
libdruntime-ldc102"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
