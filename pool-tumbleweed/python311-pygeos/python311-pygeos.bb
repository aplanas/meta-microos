SUMMARY = "GEOS wrapped in numpy ufuncs"
DESCRIPTION = "PyGEOS is a C/Python library with vectorized geometry functions. \
The geometry operations are done in the open-source geometry library GEOS. \
PyGEOS wraps these operations in NumPy ufuncs providing a performance \
improvement when operating on arrays of geometries."
LICENSE = "BSD-3-Clause"

PV = "0.14"

RPM_NAME = "python311-pygeos-0.14-1.1.aarch64.rpm"
RPM_HASH = "f871d44bc7217afefdf24b821e3b4be6e51beb7eb2bced17f65177cbc42c66d5a46e3aa7e7490a448449d716f7bec031528f763dabc17c503e9fb5f882ffbeda"

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
