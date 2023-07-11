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

RPM_NAME = "gsl_2_7_1-gnu-hpc-devel-2.7.1-1.4.aarch64.rpm"
RPM_HASH = "e423d8e0f9bf1db775eb0a5fa51e26ebea7a044ee82ea2829d4e88b59f73b259e2d5bd2571353c2c991c13ce3d9f87eb4a365c334beb21d7e9fce2b3311a5551"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl-2-7-1-gnu-hpc \
libgslcblas-2-7-1-gnu-hpc \
libm.so.6"

inherit rpm
