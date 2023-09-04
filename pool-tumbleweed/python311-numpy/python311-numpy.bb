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

RPM_NAME = "python311-numpy-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "6bde6adacf9dc726c28f1149afbd1a0dc87a237a5c3be9e5889a999de05b677876e751974dfae5fd0590f399c2dd0b8389526b98616f4c5ff07cb50e2603359d"

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
libgcc-s.so.1 \
liblapack.so.3 \
libm.so.6 \
python-abi"

inherit rpm
