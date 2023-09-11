SUMMARY = "GEOS wrapped in numpy ufuncs"
DESCRIPTION = "PyGEOS is a C/Python library with vectorized geometry functions. \
The geometry operations are done in the open-source geometry library GEOS. \
PyGEOS wraps these operations in NumPy ufuncs providing a performance \
improvement when operating on arrays of geometries."
LICENSE = "BSD-3-Clause"

PV = "0.14"

RPM_NAME = "python310-pygeos-0.14-1.1.aarch64.rpm"
RPM_HASH = "ad59fa6ecf2e750722c97d7ac51979c8558504501c6aeef8ec9fb8011c2c0f60c3ea502483b53aee1f29e1da6e05c07a866fd2092e9981d2525ef939e9d5f01b"

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
