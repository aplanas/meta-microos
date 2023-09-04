SUMMARY = "A small protobuf implementation in C"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired)."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "libupb34-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "fc877d79af2b7213d1a8ac79c501a4e1e7e934e123c98b64005638c6cb7a0fb32f393ff4bf8243b186c1bcc8d7d900615716e21a51247507d4cce79b941bea00"

RPROVIDES:${PN} += "libupb.so.34 \
libupb34"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
