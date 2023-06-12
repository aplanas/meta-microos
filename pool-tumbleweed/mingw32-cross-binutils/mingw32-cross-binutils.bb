SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw32-cross-binutils-2.39-4.3.aarch64.rpm"
RPM_HASH = "5e4aee7e9698cee2476196b6cb453f797876b87b4169a6558727b695ee3805a946ef08be0f675711fd0b35f6373fa062d4aff490525adea2d07a8b6c41ee7177"

RPROVIDES:${PN} += "libdep.so()(64bit) \
mingw32-cross-binutils \
mingw32-cross-binutils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfl.so.2()(64bit) \
libm.so.6()(64bit) \
mingw32-cross-binutils-utils \
mingw32-filesystem"

inherit rpm
