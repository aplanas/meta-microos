SUMMARY = "FIDO U2F and FIDO 2.0 protocols"
DESCRIPTION = "This library supports the FIDO U2F and FIDO 2.0 protocols for \
communicating with a USB authenticator via the \
Client-to-Authenticator Protocol (CTAP 1 and 2)."
LICENSE = "BSD-2-Clause"

PV = "1.13.0"

RPM_NAME = "libfido2-1-1.13.0-1.3.aarch64.rpm"
RPM_HASH = "c58483727eca8da698554ad2dc8609768155c5efe06dbe9592d1c0239c08d43d3f852d1ea887624c052d1847b1234f945949d7b7ddd4fa4716bf6cf5b71aa781"

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
