SUMMARY = "C library static libraries for -static linking"
DESCRIPTION = "The glibc-devel-static package contains the C library static libraries \
for -static linking.  You don't need these, unless you link statically, \
which is highly discouraged."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "glibc-devel-static-2.37-4.1.aarch64.rpm"
RPM_HASH = "9d5d312da006589d9f51e607e01c2cd658e44d05eb9f5020f9040ef7e13e38aa39f5f36e277be4b89f4dbf7617e4430579ee0173aef66394feaec63154c3d339"

RPROVIDES:${PN} += "glibc-devel-static \
glibc-static"

RDEPENDS:${PN} += "glibc-devel \
libxcrypt-devel-static"

inherit rpm
