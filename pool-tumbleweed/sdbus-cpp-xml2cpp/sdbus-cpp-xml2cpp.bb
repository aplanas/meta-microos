SUMMARY = "Stub code generator for sdbus-c++"
DESCRIPTION = "The stub code generator for generating the adapter and proxy interfaces \
out of the D-Bus IDL XML description."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "sdbus-cpp-xml2cpp-1.2.0-1.6.aarch64.rpm"
RPM_HASH = "2cbf711282b0ea7f6de5b7631a508d6d3a0779f7b23692a631ec128b31142d0ae9f73c3837b4413b688fc9dee309fe9260724f4fd71ce817c71a5d5424e5d525"

RPROVIDES:${PN} += "sdbus-cpp-xml2cpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libsdbus-c++1 \
libstdc++.so.6"

inherit rpm
