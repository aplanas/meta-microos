SUMMARY = "GNU Scientific Library"
DESCRIPTION = "The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-2.7.1-1.4.aarch64.rpm"
RPM_HASH = "817fa172311f5a9d2816235fe254a558261db6228b5ca2bf69b0db621d8d6f9ab6993a4bcbf8dd37c101af0dd75e3edf7b85826e500a7bce1cf8897cf4a4f1e4"

RPROVIDES:${PN} += "gsl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.27 \
libgslcblas.so.0 \
update-alternatives"

inherit rpm
