SUMMARY = "Stub code generator for sdbus-c++"
DESCRIPTION = "The stub code generator for generating the adapter and proxy interfaces \
out of the D-Bus IDL XML description."
LICENSE = "LGPL-2.1-only"

PV = "1.3.0"

RPM_NAME = "sdbus-cpp-xml2cpp-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "6a97930c6fad8ae6bc524c4edc613422600d85abdf97f157dae4059bd32fb814b25ffa10497facba04c4113025d7127ed2e8862937eb1338d124bdf6acfefe6a"

RPROVIDES:${PN} += "sdbus-cpp-xml2cpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libsdbus-c++1 \
libstdc++.so.6"

inherit rpm
