SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi3-devel-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "4cd82bf0a3901e3e324400b3e4969f2ce045e8ad1c66021a23ab3772597bbb2e48aacc79c7a55c98f562e0fed667f9000e32bf9f537193407577d3b766746ebf"

RPROVIDES:${PN} += "casacore-openmpi3-devel casacore-openmpi3-devel(aarch-64)"
RDEPENDS:${PN} += "gsl-devel hdf5-devel lapack-devel libboost_python3-devel libcasacore7-openmpi3 pkgconfig(cfitsio) pkgconfig(fftw3) pkgconfig(ncurses) pkgconfig(wcslib) readline-devel"

inherit rpm
