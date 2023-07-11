SUMMARY = "The D standard library"
DESCRIPTION = "This package includes ldc's phobos library - The D standard library."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "libphobos2-ldc102-1.32.0-1.2.aarch64.rpm"
RPM_HASH = "1fe483f1a30b669306037019dd4f7f5045d4331e72a03e1ad3febc65980eac026e1f5982875bcabe6782cbe5ac98692f997b2fe07eada29858042eb73c1768fb"

RPROVIDES:${PN} += "libphobos2-ldc-debug-shared.so.102 \
libphobos2-ldc-shared.so.102 \
libphobos2-ldc102"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdruntime-ldc-debug-shared.so.102 \
libdruntime-ldc-shared.so.102 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
