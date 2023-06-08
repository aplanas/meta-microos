SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi4-devel-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "9b37715b84a54edd4cfaed7f7a38103ef370d33752f2554c3d9f5caccad4417764ea72bc1b34398c136f82022219671ec766141c4eeb6f6d72fba19312504288"

RPROVIDES:${PN} += "casacore-openmpi4-devel casacore-openmpi4-devel(aarch-64)"
RDEPENDS:${PN} += "gsl-devel hdf5-devel lapack-devel libboost_python3-devel libcasacore7-openmpi4 pkgconfig(cfitsio) pkgconfig(fftw3) pkgconfig(ncurses) pkgconfig(wcslib) readline-devel"

inherit rpm
