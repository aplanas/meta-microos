SUMMARY = "Library for SPIR-V reflection and disassembly"
DESCRIPTION = "SPIRV-Cross is a tool and library designed for parsing and \
converting SPIR-V to other shader languages."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.243.0"

RPM_NAME = "libspirv-cross-c-shared0-1.3.243.0-1.2.aarch64.rpm"
RPM_HASH = "19e8bf6568bfed89b05bf4cb393efab1ba571a4c0ec4585826d31cd6f975a21902ae664dfe9bca3c786bf6e5bc3ebe3156d967463bba4eb62c7d92c710ad2b26"

RPROVIDES:${PN} += "libspirv-cross-c-shared.so.0 \
libspirv-cross-c-shared0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
