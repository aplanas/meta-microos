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

RPM_NAME = "python310-numpy_1_24_2-gnu-hpc-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "8db88b835893a543f97e0145c6114d843f9a34bbbb7570d64ae61a1b9b369d03b7cda6717fb80fcb6d3192b0b909afaf6826a4626cbfd2aae32603fa1ab347af"

RPROVIDES:${PN} += "python3.10dist-numpy \
python310-numpy-1-24-2-gnu-hpc \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopenblas-gnu-hpc"

inherit rpm
