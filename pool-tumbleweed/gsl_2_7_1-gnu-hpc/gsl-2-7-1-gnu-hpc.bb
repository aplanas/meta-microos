SUMMARY = "GNU Scientific Library"
DESCRIPTION = "The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl_2_7_1-gnu-hpc-2.7.1-2.1.aarch64.rpm"
RPM_HASH = "601846198ff5e297c2957af55899bb17f0f4388465fad803bd342740c4f0064af9f9cc2c91bb5ba335d5e32a5f35fba1ca8d11b546d2c9763ebe85030f588cf9"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl-2-7-1-gnu-hpc"

inherit rpm
