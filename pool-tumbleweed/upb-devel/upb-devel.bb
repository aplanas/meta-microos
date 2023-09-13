SUMMARY = "Developmnt files for upb"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired). \
 \
This package provides development files for upb."
LICENSE = "Apache-2.0"

PV = "1.58.0"

RPM_NAME = "upb-devel-1.58.0-1.1.aarch64.rpm"
RPM_HASH = "b2a939ea4909d55eace958ca7d684d271b66de31c41578510269298e6fad17b90c7f94cccb2227c48fc89cfd72401c3136b7224e2de6f87a6a6133a9ad73cb93"

RPROVIDES:${PN} += "upb-devel"

RDEPENDS:${PN} += "libupb35"

inherit rpm
