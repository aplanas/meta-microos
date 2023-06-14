SUMMARY = "GNU Scientific Library"
DESCRIPTION = "The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "41235d00297e7be5af6d6d9e57624f9f384d278747dcb5357b340a17fa2ddfb25e92fa578ca96b5c64ba54515341cc9b0ea1c12843be0c54fd7e9bdbaf0c051a"

RPROVIDES:${PN} += "gsl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.27 \
libgslcblas.so.0 \
update-alternatives"

inherit rpm
