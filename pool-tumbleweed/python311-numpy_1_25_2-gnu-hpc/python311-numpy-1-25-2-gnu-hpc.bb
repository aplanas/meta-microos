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

RPM_NAME = "python311-numpy_1_25_2-gnu-hpc-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "0399b20211dd64724b0a5d63059b6277d9c2d57edff5111aed1ce8a91624f9dd10e7cb23583ca3ff2ad7fa5d307a470b2033af947661237da43b1a4bbd7ca073"

RPROVIDES:${PN} += "python3-numpy-1-25-2-gnu-hpc \
python3.11dist-numpy \
python311-numpy-1-25-2-gnu-hpc \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas-gnu-hpc"

inherit rpm
