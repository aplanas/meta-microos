SUMMARY = "GEOS wrapped in numpy ufuncs"
DESCRIPTION = "PyGEOS is a C/Python library with vectorized geometry functions. \
The geometry operations are done in the open-source geometry library GEOS. \
PyGEOS wraps these operations in NumPy ufuncs providing a performance \
improvement when operating on arrays of geometries."
LICENSE = "BSD-3-Clause"

PV = "0.13"

RPM_NAME = "python39-pygeos-0.13-1.7.aarch64.rpm"
RPM_HASH = "ec40715a07e10d0a0c06ba544890fb7d0516d08522f8367f599a30dd5e7b8923101eda202b4dfc19500703e962f17caf02b164b7496a8ac117bdf67947cfa273"

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
