SUMMARY = "Minimal D runtime library"
DESCRIPTION = "The minimal runtime library required to support the D programming language."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "libdruntime-ldc102-1.32.2-1.1.aarch64.rpm"
RPM_HASH = "41eaeecc98fc35b19c02e9dd3e3e6cc06eda7d402d25ea22bbaba7b4e6ea23e99a049fd906465e659ac8222ee2e8dcf641a240902102795f7eb31eb24345e1ad"

RPROVIDES:${PN} += "libdruntime-ldc-debug-shared.so.102 \
libdruntime-ldc-shared.so.102 \
libdruntime-ldc102"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
