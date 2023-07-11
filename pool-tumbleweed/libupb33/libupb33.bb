SUMMARY = "A small protobuf implementation in C"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired)."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "libupb33-1.56.0-1.2.aarch64.rpm"
RPM_HASH = "0bb8b96d996de5d5ff03eed3ebf5e517d6381b8bef8e137d7bd343010597c74aed97510a378b605fa4bb9aeca6f55ae791cd28a7fe17fef671d228feb5a14eaa"

RPROVIDES:${PN} += "libupb.so.33 \
libupb33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
