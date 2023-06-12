SUMMARY = "The D standard library"
DESCRIPTION = "This package includes ldc's phobos library - The D standard library."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "libphobos2-ldc102-1.32.0-1.1.aarch64.rpm"
RPM_HASH = "c48d241726317c410136e47e9e4e5611b912c3f828a630c1a7421d3bdcbeac8302aff3a36ec76f425b7adcb85e7b12c22b8ead390e729ebad3e3490841deda59"

RPROVIDES:${PN} += "libphobos2-ldc-debug-shared.so.102()(64bit) \
libphobos2-ldc-shared.so.102()(64bit) \
libphobos2-ldc102 \
libphobos2-ldc102(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdruntime-ldc-debug-shared.so.102()(64bit) \
libdruntime-ldc-shared.so.102()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
