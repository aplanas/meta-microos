SUMMARY = "C++ Interface for XML Files"
DESCRIPTION = "libXML++ provides a C++ interface for XML files. It presently uses \
libxml2 to access the XML files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.3"

RPM_NAME = "libxml++-5_0-1-5.0.3-1.2.aarch64.rpm"
RPM_HASH = "5db52dc5c7f1b5ef07b7d0cd56ed3284450f75273db5748cb4097ec6a3c5ed6319d6caa7e72f7edf6e5a66e534f481146945fa16577feb9ee958d2b7ff6d78e8"

RPROVIDES:${PN} += "libxml++ \
libxml++-5.0.so.1()(64bit) \
libxml++-5_0-1 \
libxml++-5_0-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
