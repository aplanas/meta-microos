SUMMARY = "Parallel filesystem I/O benchmark"
DESCRIPTION = "Parallel filesystem I/O benchmark"
LICENSE = "GPL-2.0-only"

PV = "3.3.0"

RPM_NAME = "ior-3.3.0-3.1.aarch64.rpm"
RPM_HASH = "ef12f5c818733327a3daeae74a1e4418fb12f22f098e05da6bfa354a64579d4a2a6c78304593d8a56f0db5aec60dd520d33d6cb4eb8f6b84f920609026382372"

RPROVIDES:${PN} += "ior \
mdtest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200 \
libm.so.6 \
libmpi.so.40 \
librados.so.2"

inherit rpm
