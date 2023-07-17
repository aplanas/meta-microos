SUMMARY = "A small protobuf implementation in C"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired)."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "libupb33-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "6923251303cce81755ceea14eca681d8fd86d4d3299bc6a84aae6311577149dae7369fc714841c7ba1befca15e0721f8e8736c2069b2b91d6c1aa0a62198c7c5"

RPROVIDES:${PN} += "libupb.so.33 \
libupb33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
