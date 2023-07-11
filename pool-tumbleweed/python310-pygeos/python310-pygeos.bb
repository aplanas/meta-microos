SUMMARY = "GEOS wrapped in numpy ufuncs"
DESCRIPTION = "PyGEOS is a C/Python library with vectorized geometry functions. \
The geometry operations are done in the open-source geometry library GEOS. \
PyGEOS wraps these operations in NumPy ufuncs providing a performance \
improvement when operating on arrays of geometries."
LICENSE = "BSD-3-Clause"

PV = "0.13"

RPM_NAME = "python310-pygeos-0.13-1.7.aarch64.rpm"
RPM_HASH = "a73c378c884a4c6c16a3c3fc7036b9514d5b9e36af42370c9c0671f1b64cf03fa8ed36085b241dfef33b803e778c5166df28cd937a0a9af4416e9da08514c7e9"

RPROVIDES:${PN} += "lib.cpython-310-aarch64-linux-gnu.so \
python3.10dist-pygeos \
python310-pygeos \
python3dist-pygeos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgeos-c.so.1 \
python-abi \
python310-numpy"

inherit rpm
