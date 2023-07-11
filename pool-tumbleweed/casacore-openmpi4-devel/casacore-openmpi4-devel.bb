SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi4-devel-3.5.0-2.14.aarch64.rpm"
RPM_HASH = "9033677905103fae8fb9ffd6dc5441062c1542cabb111dc9ffcde3352b16eaae183a3a36f5e0c02bc3ff5f76eaf3c592a06d6261df23076a356bd66a3f3f0496"

RPROVIDES:${PN} += "casacore-openmpi4-devel"

RDEPENDS:${PN} += "gsl-devel \
hdf5-devel \
lapack-devel \
libboost-python3-devel \
libcasacore7-openmpi4 \
pkgconfig-cfitsio \
pkgconfig-fftw3 \
pkgconfig-ncurses \
pkgconfig-wcslib \
readline-devel"

inherit rpm
