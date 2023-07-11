SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw64-cross-binutils-2.39-4.4.aarch64.rpm"
RPM_HASH = "cd7f14806495bba2e20898b15e3274c657c8de5915ef306113547502e96d974dac42e601851b7f0d2dde17f30704805c10fded8a945ec1adbb77405b920b8dec"

RPROVIDES:${PN} += "libdep.so \
mingw64-cross-binutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfl.so.2 \
libm.so.6 \
mingw64-cross-binutils-utils \
mingw64-filesystem"

inherit rpm
