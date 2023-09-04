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

RPM_NAME = "python39-numpy-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "d534be7acdbd1f46a09988f2d566b58b70bcf903c17e7779781e43cc1653b126a785280309ece95ccbcde94abd412f982f6ad57b29347089bc045ac47cf86cf0"

RPROVIDES:${PN} += "python3.9dist-numpy \
python39-numpy \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/python3.9 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libcblas.so.3 \
libgcc-s.so.1 \
liblapack.so.3 \
libm.so.6 \
python-abi"

inherit rpm
