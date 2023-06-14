SUMMARY = "FIDO U2F and FIDO 2.0 protocols"
DESCRIPTION = "This library supports the FIDO U2F and FIDO 2.0 protocols for \
communicating with a USB authenticator via the \
Client-to-Authenticator Protocol (CTAP 1 and 2)."
LICENSE = "BSD-2-Clause"

PV = "1.13.0"

RPM_NAME = "libfido2-1-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "9d9cf2ce9ba1485c9adc34a65c75df498abbbd22caa353b2d98aa12796537da88e7966799d39cbc549717708dbd750535384f75cc454cc29e9725ad99670e008"

RPROVIDES:${PN} += "libfido2 \
libfido2-1 \
libfido2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcbor.so.0.10 \
libcrypto.so.3 \
libhidapi-hidraw.so.0 \
libudev.so.1 \
libz.so.1"

inherit rpm
