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

RPM_NAME = "python310-numpy-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "15f2bc7b42fa89c0ecbdc68a27989b9d91184e3dd0eb13508067344a6a7ca11da02cd25eb967673cf4fbe49299eb34473bdfa044dbe543f6573c75a83c80787e"

RPROVIDES:${PN} += "python3.10dist-numpy \
python310-numpy \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
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
