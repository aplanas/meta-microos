SUMMARY = "Many-body dispersion library -- headers and sources"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C. \
 \
This package provides the files needed for developing against libmbd."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-devel-0.12.6-1.4.aarch64.rpm"
RPM_HASH = "8b6e7d05e42797418c8d4508306882d50249f09c73a72aab16c13cb0e75f354fa4ce58714d42757577ee53f6c5bc70742dca46e15d9249471c6550afb39a2461"

RPROVIDES:${PN} += "cmake-Mbd \
libmbd-devel"

RDEPENDS:${PN} += "libmbd"

inherit rpm
