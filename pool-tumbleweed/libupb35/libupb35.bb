SUMMARY = "A small protobuf implementation in C"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired)."
LICENSE = "Apache-2.0"

PV = "1.58.0"

RPM_NAME = "libupb35-1.58.0-1.1.aarch64.rpm"
RPM_HASH = "aaa5087459dfb31740d2d85eeafdc5aca9d32224af961b61d30ff4d8f911f77a478c0f3883d0c235462270f19438af460c19b7997e903870b1a7de8f78c719d9"

RPROVIDES:${PN} += "libupb-collections-lib.so.35 \
libupb-json-lib.so.35 \
libupb-textformat-lib.so.35 \
libupb.so.35 \
libupb35"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libutf8-range-lib.so.35"

inherit rpm
