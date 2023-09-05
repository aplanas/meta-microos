SUMMARY = "C library static libraries for -static linking"
DESCRIPTION = "The glibc-devel-static package contains the C library static libraries \
for -static linking.  You don't need these, unless you link statically, \
which is highly discouraged."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.38"

RPM_NAME = "glibc-devel-static-2.38-2.1.aarch64.rpm"
RPM_HASH = "7fb73d7dfb4f5d43e4e4cda88866d66c9cf8be7155c8a013d92e455254c4fc2f8143f7fde363ee522726312d254c69b0ba5d7e87728ba0060a4eee4c2fb6cd20"

RPROVIDES:${PN} += "glibc-devel-static \
glibc-static"

RDEPENDS:${PN} += "glibc-devel \
libxcrypt-devel-static"

inherit rpm
