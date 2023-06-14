SUMMARY = "C++ Interface for XML Files"
DESCRIPTION = "libXML++ provides a C++ interface for XML files. It presently uses \
libxml2 to access the XML files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.4"

RPM_NAME = "libxml++-3_0-1-3.2.4-1.3.aarch64.rpm"
RPM_HASH = "745c7344ae5f81abcf0b8816997704df0e650f28a8e42ccf0ca47b8eed3b8f598f85baa5bb9b305191544c3a3d0bc6e4977cda8005ceef681b500c8f1847e146"

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
