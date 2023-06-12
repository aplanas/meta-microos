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

RPM_NAME = "libossp-uuid++16-1.6.2-19.45.aarch64.rpm"
RPM_HASH = "0b2ff2d671377968d6632306c0c83995ddc83273acada9057e1ad5e55ed9b2d8b1a25abd1feb2f474e94b2ea259e1c3e7b9c8646fa2063129a38ae8aecf2655f"

RPROVIDES:${PN} += "libossp-uuid++.so.16()(64bit) \
libossp-uuid++16 \
libossp-uuid++16(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
