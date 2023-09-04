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

RPM_NAME = "python310-numpy-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "4f37690efc61879c288cdb15bf33429465ede4e20ba3d3f3a7dac778f0e0fbbb1d2f59424eba0c057ae91a39dd6f24130cdb4fd67b3ab91d28792026f4e7de81"

RPROVIDES:${PN} += "python3.10dist-numpy \
python310-numpy \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/python3.11 \
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
