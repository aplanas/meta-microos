SUMMARY = "Perl bindings for OSSP uuid"
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
This package contains the Perl bindings for OSSP uuid."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "perl-OSSP-uuid-1.6.2-19.47.aarch64.rpm"
RPM_HASH = "4954fc4effbd514b645aff71f1783528cec7aefcf34f26911ad0bd7877864f2b625985873cc3fcc9e97c79cf2150d6ca4e935323d5a3c73093ab14d02cf53137"

RPROVIDES:${PN} += "perl-Data--UUID \
perl-Data-UUID \
perl-OSSP--uuid \
perl-OSSP--uuid--tie \
perl-OSSP-uuid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libossp-uuid.so.16 \
perl-base"

inherit rpm
