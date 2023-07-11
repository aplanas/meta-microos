SUMMARY = "C library static libraries for -static linking"
DESCRIPTION = "The glibc-devel-static package contains the C library static libraries \
for -static linking.  You don't need these, unless you link statically, \
which is highly discouraged."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "glibc-devel-static-2.37-4.4.aarch64.rpm"
RPM_HASH = "453ab6334c868c449006a709cf38bfe613b80f3ca8364606440e6355d63a59d62c4b9d3c0766b71f3b37711a8ba647fa7eb1aa25ca317530d02b2881390f0927"

RPROVIDES:${PN} += "glibc-devel-static \
glibc-static"

RDEPENDS:${PN} += "glibc-devel \
libxcrypt-devel-static"

inherit rpm
