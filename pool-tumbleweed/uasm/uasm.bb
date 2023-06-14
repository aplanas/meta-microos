SUMMARY = "MASM-compatible assembler based on JWasm"
DESCRIPTION = "MASM-compatible assembler based on JWasm"
LICENSE = "Watcom-1.0"

PV = "2.56.2"

RPM_NAME = "uasm-2.56.2-1.3.aarch64.rpm"
RPM_HASH = "e394da3cb2536c96a000dc18143f95cd83f528cdaa63a7fe535b939e824343abbdccc4d821a9f7c2e3fe7864160cf91bb738b3c8dd2e6b160502192534fe3ccd"

RPROVIDES:${PN} += "uasm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
