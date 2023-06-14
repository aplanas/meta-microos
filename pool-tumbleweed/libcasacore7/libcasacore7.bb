SUMMARY = "Shared libraries for casacore, a suite of radio astronomy data"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the shared libraries for casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "libcasacore7-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "6a748f1c9de5c332d0b80a4a2598552a73870c4bf5d95bbb3845b078cbac5f9d45360ac2c63a81672323af316a232d264554f7cef0201efc349d176014878b65"

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
libcasacore7"

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
libpython3.10.so.1.0 \
libstdc++.so.6 \
libwcs.so.7"

inherit rpm
