SUMMARY = "GEOS wrapped in numpy ufuncs"
DESCRIPTION = "PyGEOS is a C/Python library with vectorized geometry functions. \
The geometry operations are done in the open-source geometry library GEOS. \
PyGEOS wraps these operations in NumPy ufuncs providing a performance \
improvement when operating on arrays of geometries."
LICENSE = "BSD-3-Clause"

PV = "0.13"

RPM_NAME = "python39-pygeos-0.13-1.5.aarch64.rpm"
RPM_HASH = "89648502cceeefcb68173f0d3d305478677e13128aedf5bab0bb15cbdacf0393739efb32c3f1576d10cc5c78bdf6aa725fbd7f319a21070711c9bc14d5de05b9"

RPROVIDES:${PN} += "lib.cpython-39-aarch64-linux-gnu.so()(64bit) \
python3.9dist(pygeos) \
python39-pygeos \
python39-pygeos(aarch-64) \
python3dist(pygeos)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgeos_c.so.1()(64bit) \
python(abi) \
python39-numpy"

inherit rpm
