SUMMARY = "Developmnt files for upb"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired). \
 \
This package provides development files for upb."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "upb-devel-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "c9dce79b779aeed1a4766033c5ad418b535784b99923a3c89fd9c899ce8ce48bcbc2a092da4523a80038bcc089a97e6c15ca8dc2ab0c117fc8b08810a221fc40"

RPROVIDES:${PN} += "upb-devel"

RDEPENDS:${PN} += "libupb34"

inherit rpm
