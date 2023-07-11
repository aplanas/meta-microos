SUMMARY = "C++ Interface for XML Files"
DESCRIPTION = "libXML++ provides a C++ interface for XML files. It presently uses \
libxml2 to access the XML files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.4"

RPM_NAME = "libxml++-3_0-1-3.2.4-1.4.aarch64.rpm"
RPM_HASH = "75e5e880d38c88b7414882015cd35788e1943a6837a6d5354430eec5461f7b04001da28cce8581aaca5d627e8f41e3647e5ff4b42d9274ade24cc26ecc5e70ae"

RPROVIDES:${PN} += "libxml++-3-0-1 \
libxml++-3.0.so.1 \
libxml++30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglibmm-2.4.so.1 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
