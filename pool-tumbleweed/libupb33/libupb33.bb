SUMMARY = "A small protobuf implementation in C"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired)."
LICENSE = "Apache-2.0"

PV = "1.56.2"

RPM_NAME = "libupb33-1.56.2-1.1.aarch64.rpm"
RPM_HASH = "04759d11a3f105636ca4e5bfe083ace51414d836386a510b42fb8145bf4d76e19d769f875add27c9a5b2bf13954fc57415f8c7ecc2e56e54e9c33fc373a76d9f"

RPROVIDES:${PN} += "libupb.so.33 \
libupb33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
