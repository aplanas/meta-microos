SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi1-devel-3.5.0-2.14.aarch64.rpm"
RPM_HASH = "879bdca99ab96c6c1a25c02cd6de86d2e60736a83d6e5c11a2fcf463b3a3e49b7b53a908b9c21a7093ec42db09bfc2e9c51ded0861446f376b1e2eee69c2324a"

RPROVIDES:${PN} += "casacore-openmpi1-devel"

RDEPENDS:${PN} += "gsl-devel \
hdf5-devel \
lapack-devel \
libboost-python3-devel \
libcasacore7-openmpi1 \
pkgconfig-cfitsio \
pkgconfig-fftw3 \
pkgconfig-ncurses \
pkgconfig-wcslib \
readline-devel"

inherit rpm
