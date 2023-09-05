SUMMARY = "Development files for the GNU Scientific Library"
DESCRIPTION = "This package contains the headers, static libraries and some \
documentation for GSL. \
 \
The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C, and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-devel-2.7.1-2.1.aarch64.rpm"
RPM_HASH = "1e2c439af21eb14f62e970894fdc090dced7b7d1d776710589519670b9cbb4558af66e05ce116462d25b4835ef9ade0b6fbc6ebb9118a2d93b9a21b8a1d8a585"

RPROVIDES:${PN} += "gsl-devel \
pkgconfig-gsl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgsl27 \
libgslcblas0"

inherit rpm
