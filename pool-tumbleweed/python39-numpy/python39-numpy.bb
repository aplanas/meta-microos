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

PV = "1.24.2"

RPM_NAME = "python39-numpy-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "2f993b0d059130dc8ef8986f13886a9d64129ad11c6bb489355396dc3c82f1a5eee61f60ac3463cc02ab272ead9d681d11ee1021509ba779239ab7d0e5b11530"

RPROVIDES:${PN} += "python3.9dist-numpy \
python39-numpy \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libcblas.so.3 \
liblapack.so.3 \
libm.so.6 \
python-abi"

inherit rpm
