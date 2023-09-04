SUMMARY = "Development files for OSSP uuid"
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
This package contains the development files for OSSP uuid."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "uuid-devel-1.6.2-19.47.aarch64.rpm"
RPM_HASH = "20af17bb437541b4ccf3ea1f4cc52a95b6d2176e15464a0641d2c9cac8d0df4a8565c2bad57389163b3b6920adb72417fb59625c2e347f47109c98913b3309a3"

RPROVIDES:${PN} += "pkgconfig-ossp-uuid \
uuid-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libossp-uuid++16 \
libossp-uuid-dce16 \
libossp-uuid16"

inherit rpm
