SUMMARY = "Library for SPIR-V reflection and disassembly"
DESCRIPTION = "SPIRV-Cross is a tool and library designed for parsing and \
converting SPIR-V to other shader languages."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.243.0"

RPM_NAME = "libspirv-cross-c-shared0-1.3.243.0-1.1.aarch64.rpm"
RPM_HASH = "69e42af7d1da6462916708ed5384e02ddb1ee6156eb94bf01b090c8a605f3f4db557a7e379ceada50e9357b3c893cf26474c27d155ef3fcd2367903b5fba3bf5"

RPROVIDES:${PN} += "libspirv-cross-c-shared.so.0 \
libspirv-cross-c-shared0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
