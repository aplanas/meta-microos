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

RPM_NAME = "python39-numpy_1_24_2-gnu-hpc-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "53b8b0a4c8108412d6dba1131801789151677f401424d79d81bbca9bda13d89a28ae27a10e342898e5b8c451d4823fd254a370fff67db36f5b5a66bc9fbe28d4"

RPROVIDES:${PN} += "python3.9dist-numpy \
python39-numpy-1-24-2-gnu-hpc \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopenblas-gnu-hpc"

inherit rpm
