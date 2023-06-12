SUMMARY = "GEOS wrapped in numpy ufuncs"
DESCRIPTION = "PyGEOS is a C/Python library with vectorized geometry functions. \
The geometry operations are done in the open-source geometry library GEOS. \
PyGEOS wraps these operations in NumPy ufuncs providing a performance \
improvement when operating on arrays of geometries."
LICENSE = "BSD-3-Clause"

PV = "0.13"

RPM_NAME = "python311-pygeos-0.13-1.5.aarch64.rpm"
RPM_HASH = "3e229cb0e80fd59881aed408731cdfdd459841f3b5627cd33a79c434507644532c2f306d6a0f2698beac860d99b39df1adb5141922767bb95f4143104b8c2558"

RPROVIDES:${PN} += "lib.cpython-311-aarch64-linux-gnu.so()(64bit) \
python3.11dist(pygeos) \
python311-pygeos \
python311-pygeos(aarch-64) \
python3dist(pygeos)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgeos_c.so.1()(64bit) \
python(abi) \
python311-numpy"

inherit rpm
