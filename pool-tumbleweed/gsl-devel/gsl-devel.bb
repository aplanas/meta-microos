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

RPM_NAME = "gsl-devel-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "6f05b906efb57c475730359b6ece71e211b2db5a438fd2aea04b046ad9d9d84ef8c79afd016afde6bdfd2151ae9403d28cc729eacd6ed4d8139147e6ad7b837a"

RPROVIDES:${PN} += "gsl-devel \
pkgconfig-gsl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgsl27 \
libgslcblas0"

inherit rpm
