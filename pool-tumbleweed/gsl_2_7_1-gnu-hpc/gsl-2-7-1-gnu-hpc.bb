SUMMARY = "GNU Scientific Library"
DESCRIPTION = "The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl_2_7_1-gnu-hpc-2.7.1-1.4.aarch64.rpm"
RPM_HASH = "4f1891a9111bea8bfbbd46b2cf7c109ad2a5621e7ac25b0cfd9e291c32ee4438e0aef2848c4bf7e280dc52f9d77493ca0beb7afe65aca2c1fe7e49882cf84a10"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl-2-7-1-gnu-hpc"

inherit rpm
