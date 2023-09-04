SUMMARY = "OSSP's Universally Unique Identifier generator"
DESCRIPTION = "OSSP uuid is a ISO C99 application programming interface (API) and \
corresponding command line interface (CLI) for the generation of DCE 1.1, \
ISO/IEC 11578:1996 and RFC 4122 compliant Universally Unique Identifier (UUID). \
It supports DCE 1.1 variant UUIDs of version 1 (time and node based), version 3 \
(name based, MD5), version 4 (random number based) and version 5 (name based, \
SHA-1). Additional API bindings are provided for the languages ISO C++98, \
Perl 5 and PHP 4/5. Optional backward compatibility exists for the ISO C \
DCE-1.1 and Perl Data::UUID APIs. \
 \
UUIDs are 128-bit numbers which are intended to have a high likelihood of \
uniqueness over space and time and are computationally difficult to guess. They \
are globally unique identifiers which can be locally generated without \
contacting a global registration authority. UUIDs are intended as unique \
identifiers for both mass tagging objects with an extremely short lifetime and \
to reliably identifying very persistent objects across a network."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "ossp-uuid-1.6.2-19.47.aarch64.rpm"
RPM_HASH = "36c323f1ef0c922e8b603f261dc73572ae30c93f338a8602abc9a811f81da2a69971ba760205c6ab01a8394889176357982b8d560ad906ac0b7c155a8d41225a"

RPROVIDES:${PN} += "ossp-uuid \
uuid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libossp-uuid.so.16"

inherit rpm
