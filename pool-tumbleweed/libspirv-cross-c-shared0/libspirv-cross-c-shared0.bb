SUMMARY = "Library for SPIR-V reflection and disassembly"
DESCRIPTION = "SPIRV-Cross is a tool and library designed for parsing and \
converting SPIR-V to other shader languages."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.261.0"

RPM_NAME = "libspirv-cross-c-shared0-1.3.261.0-1.1.aarch64.rpm"
RPM_HASH = "15c925163feca67f509a4662f65d519e42ef4ac97f2a066df0950279054e8af573634cf633ca8df8f32d9b8ee3b16430e264292ad1a2c0fd01df0337c0fc03b4"

RPROVIDES:${PN} += "libspirv-cross-c-shared.so.0 \
libspirv-cross-c-shared0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
