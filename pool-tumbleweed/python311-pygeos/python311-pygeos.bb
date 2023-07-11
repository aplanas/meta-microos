SUMMARY = "GEOS wrapped in numpy ufuncs"
DESCRIPTION = "PyGEOS is a C/Python library with vectorized geometry functions. \
The geometry operations are done in the open-source geometry library GEOS. \
PyGEOS wraps these operations in NumPy ufuncs providing a performance \
improvement when operating on arrays of geometries."
LICENSE = "BSD-3-Clause"

PV = "0.13"

RPM_NAME = "python311-pygeos-0.13-1.7.aarch64.rpm"
RPM_HASH = "b54d836aace1fd899f601454921e8422f9f928fc1ff406fffd6a1a53232397b6b102c337ba9a104a15ce94bc9d3c86de89e18e3999fadd895b6894165c65ef70"

RPROVIDES:${PN} += "lib.cpython-311-aarch64-linux-gnu.so \
python3-pygeos \
python3.11dist-pygeos \
python311-pygeos \
python3dist-pygeos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgeos-c.so.1 \
python-abi \
python311-numpy"

inherit rpm
