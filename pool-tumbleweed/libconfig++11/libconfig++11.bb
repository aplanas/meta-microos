SUMMARY = "C++ API of libconfig"
DESCRIPTION = "libconfig is a library for manipulating structured configuration \
files. The supported file format is more compact and more readable \
than XML. Unlike XML, it is type-aware, so it is not necessary to do \
string parsing in application code. \
 \
This package contains the shared libraries for libconfig."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.3"

RPM_NAME = "libconfig++11-1.7.3-1.9.aarch64.rpm"
RPM_HASH = "c6033a70e42a112b2d4ca82818d3831f78a4182dba70c1f397c5de4fa5da1cf07aa76eeb979e0f05ab700f5ba38e2a19563f81932f28717edc36677a31bfd297"

RPROVIDES:${PN} += "libconfig++.so.11 \
libconfig++11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
