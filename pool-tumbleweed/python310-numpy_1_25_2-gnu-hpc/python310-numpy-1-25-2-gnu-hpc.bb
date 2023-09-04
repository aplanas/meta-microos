SUMMARY = "NumPy array processing for numbers, strings, records and objects"
DESCRIPTION = "NumPy is a general-purpose array-processing package designed to \
efficiently manipulate large multi-dimensional arrays of arbitrary \
records without sacrificing too much speed for small multi-dimensional \
arrays.  NumPy is built on the Numeric code base and adds features \
introduced by numarray as well as an extended C-API and the ability to \
create arrays of arbitrary type which also makes NumPy suitable for \
interfacing with general-purpose data-base applications. \
 \
There are also basic facilities for discrete fourier transform, \
basic linear algebra and random number generation."
LICENSE = "BSD-3-Clause"

PV = "1.25.2"

RPM_NAME = "python310-numpy_1_25_2-gnu-hpc-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "79ba0c6c537a23e74b1d894623443b273f9dd1e337247d2e43547d613e2a6ee7fc44d3253151e67c6ae81029cde50b9b008cb7a791dadf7e6108d045b8da6b30"

RPROVIDES:${PN} += "python3.10dist-numpy \
python310-numpy-1-25-2-gnu-hpc \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas-gnu-hpc"

inherit rpm
