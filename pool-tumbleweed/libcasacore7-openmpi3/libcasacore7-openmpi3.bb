SUMMARY = "Shared libraries for casacore, a suite of radio astronomy data"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the shared libraries for casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "libcasacore7-openmpi3-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "603bc0daf0367357f95466916a3ee90e231dd0f08b8c0169fb1488eb6c0d2545445929c334dee950b19041eb6603921209a46a474903b21d73d0b492e505d567"

RPROVIDES:${PN} += "libcasa_casa.so.7()(64bit) \
libcasa_coordinates.so.7()(64bit) \
libcasa_derivedmscal.so.7()(64bit) \
libcasa_fits.so.7()(64bit) \
libcasa_images.so.7()(64bit) \
libcasa_lattices.so.7()(64bit) \
libcasa_meas.so.7()(64bit) \
libcasa_measures.so.7()(64bit) \
libcasa_mirlib.so.7()(64bit) \
libcasa_ms.so.7()(64bit) \
libcasa_msfits.so.7()(64bit) \
libcasa_python3.so.7()(64bit) \
libcasa_scimath.so.7()(64bit) \
libcasa_scimath_f.so.7()(64bit) \
libcasa_tables.so.7()(64bit) \
libcasacore7-openmpi3 \
libcasacore7-openmpi3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libboost_python-py3.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcfitsio.so.10()(64bit) \
libfftw3.so.3()(64bit) \
libfftw3_threads.so.3()(64bit) \
libfftw3f.so.3()(64bit) \
libfftw3f_threads.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgomp.so.1()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libhdf5.so.200()(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi.so.40()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libwcs.so.7()(64bit)"

inherit rpm
