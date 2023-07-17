SUMMARY = "The D standard library"
DESCRIPTION = "This package includes ldc's phobos library - The D standard library."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "libphobos2-ldc102-1.32.2-1.1.aarch64.rpm"
RPM_HASH = "7a595ab0ee101126ea1a3cb2edfe6eba02072b922d5f52157961fa4687ab211148346dff1410bcaa609f94138b22353c27b5b7064e0392e4ce5a64ac4f3cc5ff"

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
