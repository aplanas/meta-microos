SUMMARY = "Development files for spglib/libsymspg"
DESCRIPTION = "Spglib is a C library to find and handle crystal symmetries."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "spglib-devel-2.0.2-1.4.aarch64.rpm"
RPM_HASH = "9c01be17d0e0c011a2155b3cd271a34a23f0082f3b7c83e0db73d6a767152aca640c703f6017fa684a04cc860dcec3067e62105295581cf1b6d2548db1b962a0"

RPROVIDES:${PN} += "pkgconfig-spglib \
spglib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsymspg1"

inherit rpm
