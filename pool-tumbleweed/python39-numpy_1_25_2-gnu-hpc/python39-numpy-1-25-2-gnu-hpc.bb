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

RPM_NAME = "python39-numpy_1_25_2-gnu-hpc-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "8fa223766d1ba700c0871538a190c96883cd97ac8bad8c8861774d173d8dc6367815680879e56ff5ad423bd4eac39824e61c121d088b8d9a908dbd43a50b2047"

RPROVIDES:${PN} += "python3.9dist-numpy \
python39-numpy-1-25-2-gnu-hpc \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas-gnu-hpc"

inherit rpm
