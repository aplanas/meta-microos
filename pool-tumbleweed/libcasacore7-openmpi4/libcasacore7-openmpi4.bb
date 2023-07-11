SUMMARY = "Shared libraries for casacore, a suite of radio astronomy data"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the shared libraries for casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "libcasacore7-openmpi4-3.5.0-2.14.aarch64.rpm"
RPM_HASH = "9f16a22fc826bc5375b572551b260f34988a217ec232a1da7a1ef3c314f97cb6c3d8d5113f3c54d6b2fc8deab03cae3d619706c4b647cf2045e12daf6c883424"

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
libcasacore7-openmpi4"

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
libmpi.so.40 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libwcs.so.7"

inherit rpm
