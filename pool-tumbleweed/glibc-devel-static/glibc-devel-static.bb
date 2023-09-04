SUMMARY = "C library static libraries for -static linking"
DESCRIPTION = "The glibc-devel-static package contains the C library static libraries \
for -static linking.  You don't need these, unless you link statically, \
which is highly discouraged."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.38"

RPM_NAME = "glibc-devel-static-2.38-1.1.aarch64.rpm"
RPM_HASH = "3b29fed4542739a61c996cc66687bbeb627504bce1fa51b1c1394963c73888d00e5336cf451e2f35759a26f5315049483f8156380c88eb28dabc6c152e8d6aaa"

RPROVIDES:${PN} += "glibc-devel-static \
glibc-static"

RDEPENDS:${PN} += "glibc-devel \
libxcrypt-devel-static"

inherit rpm
