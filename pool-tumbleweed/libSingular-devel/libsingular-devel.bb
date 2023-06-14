SUMMARY = "Development files for Singular's 'Singular' library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libSingular-devel-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "95e59745ea667ff26ae95e3555ff7a98ee691f55e03951d7920e2842bf41ce3cbeb794fead06e56f21c9de1f4a20c9d6050801a02171cc864507add4de6d9367"

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
