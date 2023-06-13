SUMMARY = "C++ Interface for XML Files"
DESCRIPTION = "libXML++ provides a C++ interface for XML files. It presently uses \
libxml2 to access the XML files."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libxml++-2_6-2-2.42.2-2.3.aarch64.rpm"
RPM_HASH = "ef094e2e70b794466bcc93f873ee5c91540c7b02b2acdc0d41e39fcd905b85b2de9e0a360fa355e7427b0eb57217969217013d294fc0371b6ab669027c57ecdc"

RPROVIDES:${PN} += "libxml++-2.6.so.2()(64bit) \
libxml++-2_6-2 \
libxml++-2_6-2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
