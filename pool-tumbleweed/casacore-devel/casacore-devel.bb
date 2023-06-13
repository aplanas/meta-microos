SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-devel-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "26c2d7bba7456dd4c6d8b258248cc60ea680c56739f069b8efc2844f53988d01449887297846c744a58483c1c3205b948aa43c20c4b60ed939f9404c5cf4d0e9"

RPROVIDES:${PN} += "casacore-devel \
casacore-devel(aarch-64) \
pkgconfig(casacore)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gsl-devel \
hdf5-devel \
lapack-devel \
libboost_python3-devel \
libcasacore7 \
pkgconfig(cfitsio) \
pkgconfig(fftw3) \
pkgconfig(ncurses) \
pkgconfig(wcslib) \
readline-devel"

inherit rpm
