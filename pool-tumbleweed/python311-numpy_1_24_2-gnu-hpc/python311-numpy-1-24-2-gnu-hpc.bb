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

RPM_NAME = "python311-numpy_1_24_2-gnu-hpc-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "ba14993fdb57c8ad2a8138884879ab3f5879bddb5143f092a19536d83747772ecaad96e4a08e29eb4e2bf8f7a85ed3e97801ff14a21d5720f4de7b5cc20f02bc"

RPROVIDES:${PN} += "python3.11dist-numpy \
python311-numpy-1-24-2-gnu-hpc \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopenblas-gnu-hpc"

inherit rpm
