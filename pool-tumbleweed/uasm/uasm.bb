SUMMARY = "MASM-compatible assembler based on JWasm"
DESCRIPTION = "MASM-compatible assembler based on JWasm"
LICENSE = "Watcom-1.0"

PV = "2.56.2"

RPM_NAME = "uasm-2.56.2-1.4.aarch64.rpm"
RPM_HASH = "46fd4a8e62a621fe6fb790900ba5bd985a9ba6c863967db479a274cfa515d600ee7088ef93f35a77d871987dd7eb72b47efedbd71fd82c8025355e8c0293fd3e"

RPROVIDES:${PN} += "uasm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
