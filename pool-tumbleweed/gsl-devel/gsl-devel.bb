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

RPM_NAME = "gsl-devel-2.7.1-1.4.aarch64.rpm"
RPM_HASH = "2f8232943a58fa0f9634e3bcd087bdb21bc3a4e01016971d86a23a5f70dcade8edcc7b4b27dee4a5fc56212b1496fc9418bb050423c450f1739d8e5750acff1d"

RPROVIDES:${PN} += "gsl-devel \
pkgconfig-gsl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgsl27 \
libgslcblas0"

inherit rpm
