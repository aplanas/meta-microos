SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi1-devel-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "fc62ab7f82448ba80373dec70fa467a8d11261cb89ecfe7ef33f6192b002e69437a45e256c73f92e73dc8706fde52dcd9602278722cd2af8105c550f74623f1f"

RPROVIDES:${PN} += "casacore-openmpi1-devel \
casacore-openmpi1-devel(aarch-64)"
RDEPENDS:${PN} += "gsl-devel \
hdf5-devel \
lapack-devel \
libboost_python3-devel \
libcasacore7-openmpi1 \
pkgconfig(cfitsio) \
pkgconfig(fftw3) \
pkgconfig(ncurses) \
pkgconfig(wcslib) \
readline-devel"

inherit rpm
