SUMMARY = "GEOS wrapped in numpy ufuncs"
DESCRIPTION = "PyGEOS is a C/Python library with vectorized geometry functions. \
The geometry operations are done in the open-source geometry library GEOS. \
PyGEOS wraps these operations in NumPy ufuncs providing a performance \
improvement when operating on arrays of geometries."
LICENSE = "BSD-3-Clause"

PV = "0.14"

RPM_NAME = "python39-pygeos-0.14-1.1.aarch64.rpm"
RPM_HASH = "51e4de56a4edec55b22b201231b9b85796801be7e80f3e673c3ab1fadfce402e747304be77d77723f1777a5345cc1e378d93289642c832fbed28be170046ac21"

RPROVIDES:${PN} += "lib.cpython-39-aarch64-linux-gnu.so \
python3.9dist-pygeos \
python39-pygeos \
python3dist-pygeos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgeos-c.so.1 \
python-abi \
python39-numpy"

inherit rpm
