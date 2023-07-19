SUMMARY = "C library static libraries for -static linking"
DESCRIPTION = "The glibc-devel-static package contains the C library static libraries \
for -static linking.  You don't need these, unless you link statically, \
which is highly discouraged."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "glibc-devel-static-2.37-5.1.aarch64.rpm"
RPM_HASH = "dc35c5072c8ffbab72344bd53b52b3d42d013d9eab1afddcbc69be5606acdbea30ea8f2a2b89824543b7604a6e62f8e8afc08979ffd7dea2f1dae13d6e68fabf"

RPROVIDES:${PN} += "glibc-devel-static \
glibc-static"

RDEPENDS:${PN} += "glibc-devel \
libxcrypt-devel-static"

inherit rpm
