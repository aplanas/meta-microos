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

RPM_NAME = "python311-numpy-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "da1125c00002e96d6184546df6310297fe7f1c3d6515af98c59c4588449b3a9c77a71403324c8248823411adac0eb272b9bc28edc6acfffc4776b3501981ad0f"

RPROVIDES:${PN} += "python3-numpy \
python3.11dist-numpy \
python311-numpy \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
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
