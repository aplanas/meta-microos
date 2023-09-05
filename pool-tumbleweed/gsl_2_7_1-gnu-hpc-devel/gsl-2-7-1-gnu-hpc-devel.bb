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

RPM_NAME = "gsl_2_7_1-gnu-hpc-devel-2.7.1-2.1.aarch64.rpm"
RPM_HASH = "84875af8798d869f321a28be429406e2fa0cf31cd1dc59c2c6b32f4709ef62379b78db4044e4e7e4d2c65d90035e9bc0fba67b7af3856d827fbd606057d56591"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl-2-7-1-gnu-hpc \
libgslcblas-2-7-1-gnu-hpc \
libm.so.6"

inherit rpm
