SUMMARY = "Shared libraries for casacore, a suite of radio astronomy data"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the shared libraries for casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "libcasacore7-openmpi2-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "13aeeb0a55f89233450f8066842b2a2af57286d5e5239f962c81696f53223756e7f19b5265b064a0ffda2aa8338715f9b90a436a7d7ea39c22f7aa7c9ab94041"

RPROVIDES:${PN} += "libcasa-casa.so.7 \
libcasa-coordinates.so.7 \
libcasa-derivedmscal.so.7 \
libcasa-fits.so.7 \
libcasa-images.so.7 \
libcasa-lattices.so.7 \
libcasa-meas.so.7 \
libcasa-measures.so.7 \
libcasa-mirlib.so.7 \
libcasa-ms.so.7 \
libcasa-msfits.so.7 \
libcasa-python3.so.7 \
libcasa-scimath-f.so.7 \
libcasa-scimath.so.7 \
libcasa-tables.so.7 \
libcasacore7-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libcfitsio.so.10 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgomp.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libhdf5.so.200 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.20 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
libwcs.so.7"

inherit rpm
