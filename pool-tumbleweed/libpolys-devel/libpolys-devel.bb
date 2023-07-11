SUMMARY = "Development files for Singular's POLYS library"
DESCRIPTION = "Data structures and basic algorithms for polynomials \
in Singular"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libpolys-devel-4.3.1.p3-1.4.aarch64.rpm"
RPM_HASH = "281c5458a22ca693c7c8b926040e4acdb9a2d58abb485e37e4a99bb000da1b5db24d9ca48f9b26ac56fa119f52fa80ab755920ca75ba88b9c5c3463b7966b28c"

RPROVIDES:${PN} += "libpolys-devel \
pkgconfig-libpolys"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSingular-devel \
libpolys-4-3-1 \
pkgconfig-factory \
pkgconfig-omalloc \
pkgconfig-singular-resources"

inherit rpm
