SUMMARY = "Stub code generator for sdbus-c++"
DESCRIPTION = "The stub code generator for generating the adapter and proxy interfaces \
out of the D-Bus IDL XML description."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "sdbus-cpp-xml2cpp-1.2.0-1.5.aarch64.rpm"
RPM_HASH = "d83f3f557de58b15c8593767dd9f07ba09ea4f9eca9ab9f369895831d0e5e928214becfb8f96e48b110fda9be7436189b939e1c77852a81b9c28ac6a44d88acb"

RPROVIDES:${PN} += "sdbus-cpp-xml2cpp \
sdbus-cpp-xml2cpp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libsdbus-c++1 \
libstdc++.so.6()(64bit)"

inherit rpm
