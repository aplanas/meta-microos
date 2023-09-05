SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libgdruntime4-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "2f025329938c60a0b641cbf32bddaa5486eb979f6af0e6bfc66bd1cdaa91af4892b09226236ea7d4a48470e6fff8035891a73c6348101e905e9195c0d0c4cedc"

RPROVIDES:${PN} += "libgdruntime.so.4 \
libgdruntime4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
