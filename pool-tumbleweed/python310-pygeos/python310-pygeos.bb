SUMMARY = "GEOS wrapped in numpy ufuncs"
DESCRIPTION = "PyGEOS is a C/Python library with vectorized geometry functions. \
The geometry operations are done in the open-source geometry library GEOS. \
PyGEOS wraps these operations in NumPy ufuncs providing a performance \
improvement when operating on arrays of geometries."
LICENSE = "BSD-3-Clause"

PV = "0.13"

RPM_NAME = "python310-pygeos-0.13-1.5.aarch64.rpm"
RPM_HASH = "ee390bb75259a07e8113b6386705aafb85d6f5c9ac42d2108661a816a824dce90aea511e3bf862c516661bd8d1ab6ad5622d8e3b6e10c04663148db7da4e022e"

RPROVIDES:${PN} += "lib.cpython-310-aarch64-linux-gnu.so \
python3-pygeos \
python3.10dist-pygeos \
python310-pygeos \
python3dist-pygeos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgeos-c.so.1 \
python-abi \
python310-numpy"

inherit rpm
