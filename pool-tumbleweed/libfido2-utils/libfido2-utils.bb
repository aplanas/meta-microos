SUMMARY = "Utility programs making use of libfido2, a library for FIDO U2F and FIDO 2.0"
DESCRIPTION = "This package contains utilities to use FIDO U2F and FIDO 2.0 protocols."
LICENSE = "BSD-2-Clause"

PV = "1.13.0"

RPM_NAME = "libfido2-utils-1.13.0-1.3.aarch64.rpm"
RPM_HASH = "412ca91355062dbb3b58b4ddccff912adc2a0d7a26d65e19802ed28a869934260ed5d1489a9060d06d8eb1ead92e54d7c0351bfb8db99353827a47b4f1024eff"

RPROVIDES:${PN} += "libfido2-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcbor.so.0.10 \
libcrypto.so.3 \
libfido2.so.1 \
libz.so.1"

inherit rpm
