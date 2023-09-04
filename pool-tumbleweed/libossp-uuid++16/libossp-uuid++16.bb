SUMMARY = "OSSP's Universally Unique Identifier generator library"
DESCRIPTION = "OSSP uuid is a ISO C99 application programming interface (API) and \
corresponding command line interface (CLI) for the generation of DCE 1.1, \
ISO/IEC 11578:1996 and RFC 4122 compliant Universally Unique Identifier (UUID). \
It supports DCE 1.1 variant UUIDs of version 1 (time and node based), version 3 \
(name based, MD5), version 4 (random number based) and version 5 (name based, \
SHA-1). Additional API bindings are provided for the languages ISO C++98, \
Perl 5 and PHP 4/5. Optional backward compatibility exists for the ISO-C \
DCE-1.1 and Perl Data::UUID APIs. \
 \
UUIDs are 128-bit numbers which are intended to have a high likelihood of \
uniqueness over space and time and are computationally difficult to guess. They \
are globally unique identifiers which can be locally generated without \
contacting a global registration authority. UUIDs are intended as unique \
identifiers for both mass tagging objects with an extremely short lifetime and \
to reliably identifying very persistent objects across a network. \
 \
 \
This package contains the shared C++ library of OSSP uuid."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "libossp-uuid++16-1.6.2-19.47.aarch64.rpm"
RPM_HASH = "11b9b4f1068091214313fdcf3ae29da494e40803a59d47c885f1406da7613b5914792cdd02f8c9bb55ee53c877a210f57d9e0e790b0198f478ee25f808be35e1"

RPROVIDES:${PN} += "libossp-uuid++.so.16 \
libossp-uuid++16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
