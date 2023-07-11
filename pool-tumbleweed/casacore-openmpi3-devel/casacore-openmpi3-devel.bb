SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi3-devel-3.5.0-2.14.aarch64.rpm"
RPM_HASH = "6edb483700e9043ccefb4476ba7fdae3fa8b94d649cedb187686805698d21621f67dbd907ff6a6747331049a814400128bc79d7cf624c5c0123fd6135cb612ca"

RPROVIDES:${PN} += "casacore-openmpi3-devel"

RDEPENDS:${PN} += "gsl-devel \
hdf5-devel \
lapack-devel \
libboost-python3-devel \
libcasacore7-openmpi3 \
pkgconfig-cfitsio \
pkgconfig-fftw3 \
pkgconfig-ncurses \
pkgconfig-wcslib \
readline-devel"

inherit rpm
