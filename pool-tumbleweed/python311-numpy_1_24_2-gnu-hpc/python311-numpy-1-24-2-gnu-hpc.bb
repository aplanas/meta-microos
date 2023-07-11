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

RPM_NAME = "python311-numpy_1_24_2-gnu-hpc-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "4c2f496fcbfc23e933d2186fe1d15c94b1d7be244cd4d170989b4f8a6584a56a67875211cb6ebe2b7327ba06aa9092cd0216afc49a7dc0341ade7cc03eb1042b"

RPROVIDES:${PN} += "python3-numpy-1-24-2-gnu-hpc \
python3.11dist-numpy \
python311-numpy-1-24-2-gnu-hpc \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopenblas-gnu-hpc"

inherit rpm
