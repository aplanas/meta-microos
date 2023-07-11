SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi2-devel-3.5.0-2.14.aarch64.rpm"
RPM_HASH = "0903577f5b332c19a3321deda3327f4cba9fa1571291fd80db82b8f23fd05ab37e04db9d4451413fe11c1c2ce99cd800626b058c8f147b50402eb578fd0feb52"

RPROVIDES:${PN} += "casacore-openmpi2-devel"

RDEPENDS:${PN} += "gsl-devel \
hdf5-devel \
lapack-devel \
libboost-python3-devel \
libcasacore7-openmpi2 \
pkgconfig-cfitsio \
pkgconfig-fftw3 \
pkgconfig-ncurses \
pkgconfig-wcslib \
readline-devel"

inherit rpm
