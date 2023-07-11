SUMMARY = "Developmnt files for upb"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired). \
 \
This package provides development files for upb."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "upb-devel-1.56.0-1.2.aarch64.rpm"
RPM_HASH = "2a1a1392ff0f5a1015294f72669ec16a343bb5095228d9026a33974ee7337feba123718bfa3b88afc671d9e2361c12965145629d1a4794bea959e7f0ce5d8a27"

RPROVIDES:${PN} += "upb-devel"

RDEPENDS:${PN} += "libupb33"

inherit rpm
