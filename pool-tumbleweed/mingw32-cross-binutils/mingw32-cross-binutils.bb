SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw32-cross-binutils-2.39-4.4.aarch64.rpm"
RPM_HASH = "221e2c337ffff48718f0634fcc3eb00082e945d81c528e0d4a96fdfe09d39dbd1ee4c59429459e8016f122b32385b78a907964d6b73c107a1c51954385a8c81c"

RPROVIDES:${PN} += "libdep.so \
mingw32-cross-binutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfl.so.2 \
libm.so.6 \
mingw32-cross-binutils-utils \
mingw32-filesystem"

inherit rpm
