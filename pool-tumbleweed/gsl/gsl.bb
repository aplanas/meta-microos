SUMMARY = "GNU Scientific Library"
DESCRIPTION = "The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-2.7.1-2.1.aarch64.rpm"
RPM_HASH = "1c0cd3081d8e8f51ea001cacff050261a2ef0c7ce31269cee90d40776dd6b9a6fba60af150a061755d69dbd4d28d724e2c1231e6bada42bfa08778fc110354bf"

RPROVIDES:${PN} += "gsl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.27 \
libgslcblas.so.0 \
update-alternatives"

inherit rpm
