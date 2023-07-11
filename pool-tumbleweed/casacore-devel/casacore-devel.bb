SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-devel-3.5.0-2.14.aarch64.rpm"
RPM_HASH = "03aaa8e1e9658a4a86b5ebfb62ad3ac0df6933d0d813ffffff3b00d3cac99cfa01e36d009c954b73fc7ec33924e2a928ffced1e5d70a3248fe3e7c55f28e4736"

RPROVIDES:${PN} += "casacore-devel \
pkgconfig-casacore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gsl-devel \
hdf5-devel \
lapack-devel \
libboost-python3-devel \
libcasacore7 \
pkgconfig-cfitsio \
pkgconfig-fftw3 \
pkgconfig-ncurses \
pkgconfig-wcslib \
readline-devel"

inherit rpm
