SUMMARY = "Development files for Singular's 'Singular' library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libSingular-devel-4.3.1.p3-1.4.aarch64.rpm"
RPM_HASH = "d7ae7ef9538912a6510156f3ce96f6f6d773f40a7c8b51659dcd854751124f1ac56a297ec8a7e0b2ef63ea40335a6e301dacaa98fc64ec0a9fe25709e9707caf"

RPROVIDES:${PN} += "libSingular-devel \
pkgconfig-Singular"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSingular-4-3-1 \
mpfr-devel \
pkgconfig-factory \
pkgconfig-libpolys \
pkgconfig-omalloc \
pkgconfig-singular-resources"

inherit rpm
