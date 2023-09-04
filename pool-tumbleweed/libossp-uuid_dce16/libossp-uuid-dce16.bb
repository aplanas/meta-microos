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
This package contains the shared library of OSSP uuid with DCE compatibility."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "libossp-uuid_dce16-1.6.2-19.47.aarch64.rpm"
RPM_HASH = "c2235220e24dcc297eacf2daae8874d4b011af1e9ed8aa0802c1ca6f494b9b7af1d8dd66fb26e95107540646ec8fcfb16191b5a007017673d47d3ddf77904c26"

RPROVIDES:${PN} += "libossp-uuid-dce.so.16 \
libossp-uuid-dce16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
