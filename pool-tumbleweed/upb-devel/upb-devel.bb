SUMMARY = "Developmnt files for upb"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired). \
 \
This package provides development files for upb."
LICENSE = "Apache-2.0"

PV = "1.56.2"

RPM_NAME = "upb-devel-1.56.2-1.1.aarch64.rpm"
RPM_HASH = "b0278cfaedc911947d87cc0f17c8fb8f56e162fe791f7364ed7fef213ce02eb891290c340b14dbba3b3e3996926b54ec2d5b9ceab5af160fb1e191a37ee5b47d"

RPROVIDES:${PN} += "upb-devel"

RDEPENDS:${PN} += "libupb33"

inherit rpm
