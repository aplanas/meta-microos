SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi2-devel-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "4b305d8f99783497a7fe9e1a82d2dbe5f352431b1742764d2a092273cf3fb5d34e50253cdfadc7f52e68176b22d68d338c84f0d193b9549c6edc89df6b1aeab6"

RPROVIDES:${PN} += "casacore-openmpi2-devel \
casacore-openmpi2-devel(aarch-64)"

RDEPENDS:${PN} += "gsl-devel \
hdf5-devel \
lapack-devel \
libboost_python3-devel \
libcasacore7-openmpi2 \
pkgconfig(cfitsio) \
pkgconfig(fftw3) \
pkgconfig(ncurses) \
pkgconfig(wcslib) \
readline-devel"

inherit rpm
