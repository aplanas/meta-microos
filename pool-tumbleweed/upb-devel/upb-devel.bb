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

RPM_NAME = "upb-devel-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "c62c63bb82abfb531bd6877cca3af05f84f824d64523f4bb0b5cfb57f1827dba83cb042e259cdba687e3f87d4bb0fc397a34972f3721a70e3944bf023375beb6"

RPROVIDES:${PN} += "upb-devel"

RDEPENDS:${PN} += "libupb33"

inherit rpm
