SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw64-cross-binutils-2.39-4.3.aarch64.rpm"
RPM_HASH = "200eb10be175601f9aadcf2921c291882608f5a8882fc510cfe954aa431d9c5e9a557edf29dbe419d7600c881eaf76f0df3dc10d9366c5f9070428bb9a53d341"

RPROVIDES:${PN} += "libdep.so()(64bit) \
mingw64-cross-binutils \
mingw64-cross-binutils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfl.so.2()(64bit) \
libm.so.6()(64bit) \
mingw64-cross-binutils-utils \
mingw64-filesystem"

inherit rpm
